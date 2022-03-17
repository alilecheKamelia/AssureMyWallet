package com.projets.innovations.asssurWallet.asssureMyWallet.services;

import com.projets.innovations.asssurWallet.asssureMyWallet.dtos.ClientDTO;
import com.projets.innovations.asssurWallet.asssureMyWallet.dtos.ContratDTO;
import com.projets.innovations.asssurWallet.asssureMyWallet.model.Client;
import com.projets.innovations.asssurWallet.asssureMyWallet.model.ClientDAO;
import com.projets.innovations.asssurWallet.asssureMyWallet.model.Contrat;
import com.projets.innovations.asssurWallet.asssureMyWallet.model.ContratDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceAssurWalletImpl implements ServiceAssurWallet {
    @Autowired
    private ContratDAO contratDAO;
    @Autowired
    private ClientDAO clientDAO;



    public String createContrat(ContratDTO contratDTO){
        Contrat contrat = new Contrat(contratDTO.getId(),contratDTO.getDateFinContrat(),contratDTO.getDateContrat(),  contratDTO.getGaranties(),contratDTO.getTarif(),contratDTO.getDescription());
        this.contratDAO.insert(contrat);
        return contrat.toString();
    }

    @Override
    public List<String> garantiesContrat(String id) {
        Optional<Contrat> contrat =  this.contratDAO.findById(id);
        List<String> garanties=contrat.get().getGaranties();
        return garanties;
    }

    @Override
    public List<Client> getClients() {
        return this.clientDAO.findAll();
    }

    @Override
    public List<Contrat> getContrats() {
        return contratDAO.findAll();
    }


    @Override
    public Optional<Contrat> findContrat(String id) {
        Optional<Contrat> contrat =  this.contratDAO.findById(id);
        return contrat;
        
    }
    @Override
    public Optional<Client> findClient(String id) {
        Optional<Client> client =  this.clientDAO.findById(id);
        return client;

    }
    public String createClient(ClientDTO clientDTO){
        Client cl = new Client(clientDTO.getId(),clientDTO.getNom(),clientDTO.getPrenom(),clientDTO.getAge(),clientDTO.getAdresse(),clientDTO.getContrats());
        this.clientDAO.insert(cl);
        return cl.toString();
    }
}
