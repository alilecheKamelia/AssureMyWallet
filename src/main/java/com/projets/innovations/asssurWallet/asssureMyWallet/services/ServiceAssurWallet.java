package com.projets.innovations.asssurWallet.asssureMyWallet.services;

import com.projets.innovations.asssurWallet.asssureMyWallet.dtos.ContratDTO;
import com.projets.innovations.asssurWallet.asssureMyWallet.model.Client;
import com.projets.innovations.asssurWallet.asssureMyWallet.model.Contrat;

import java.util.List;
import java.util.Optional;

public interface ServiceAssurWallet {
    List<Contrat> getContrats();

    Optional<Contrat> findContrat(String id);
     String createContrat(ContratDTO contratDTO);
    List<String> garantiesContrat(String id);
    List<Client> getClients();
    Optional<Client> findClient(String id);
}
