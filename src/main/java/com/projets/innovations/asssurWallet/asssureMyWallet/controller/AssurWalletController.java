package com.projets.innovations.asssurWallet.asssureMyWallet.controller;

import com.projets.innovations.asssurWallet.asssureMyWallet.dtos.ContratDTO;
import com.projets.innovations.asssurWallet.asssureMyWallet.model.Client;
import com.projets.innovations.asssurWallet.asssureMyWallet.model.ClientDAO;
import com.projets.innovations.asssurWallet.asssureMyWallet.model.Contrat;
import com.projets.innovations.asssurWallet.asssureMyWallet.model.ContratDAO;
import com.projets.innovations.asssurWallet.asssureMyWallet.services.ServiceAssurWalletImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
@RestController
@RequestMapping("")
public class AssurWalletController {

    @Autowired
    ServiceAssurWalletImpl serviceAssurWallet;
    @Autowired
    private ContratDAO contratDAO;
    @Autowired
    private ClientDAO clientDAO;
    /**
     * Permet de récupérer la liste des contrats
     * @return
     */

    @GetMapping(value="/contrats",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Stream<Contrat>> getAllContrats() {
        return  ResponseEntity.ok(serviceAssurWallet.getContrats().stream());

    }

 @PostMapping(value="/contrat/add")
    public ResponseEntity<String> createContrat(@RequestBody ContratDTO contrat) {
        String uir=serviceAssurWallet.createContrat(contrat);
        System.out.println(uir);
        URI location =  UriComponentsBuilder
                .fromUriString("contrat/{id}")
                .build(uir);
        return ResponseEntity.created(location).build();
    }

    @GetMapping(value="/contrat/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<Contrat>> getContratById(@PathVariable String id) {
        //System.out.println(contratDAO.toString());
       Optional<Contrat> contrat = contratDAO.findById(id);

        return ResponseEntity.ok(contrat);

    }
    @GetMapping(value="/contrat/garanties/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getGarantiesById(@PathVariable String id) {
        //System.out.println(contratDAO.toString());
        Optional<Contrat> contrat = contratDAO.findById(id);
        List<String> garanties=serviceAssurWallet.garantiesContrat(id);

        return  ResponseEntity.ok(garanties.toString());

    }
    @PostMapping(value="/devis")
    public ResponseEntity<String> createContrat(@RequestBody Client client) {
        Client uir=clientDAO.insert(client);
        System.out.println(uir);
        URI location =  UriComponentsBuilder
                .fromUriString("devis/{id}")
                .build(uir);
        return ResponseEntity.created(location).build();
    }

    @GetMapping(value="/devis/clients",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Stream<Client>> getAllClients() {
        return  ResponseEntity.ok(serviceAssurWallet.getClients().stream());

    }
    @GetMapping(value="/devis/clients/{idClient}",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getClientById(@PathVariable String idClient) {
        String str=clientDAO.findById(idClient).toString();
        return clientDAO.findById(idClient).toString() ;

    }

}
