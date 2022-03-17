package com.projets.innovations.asssurWallet.asssureMyWallet.model;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContratDAO extends MongoRepository<Contrat, String> {
    //public Contrat insert(Contrat contrat);
    //public Contrat save(Contrat recipe);
    //public List<Contrat> findAll();

}

