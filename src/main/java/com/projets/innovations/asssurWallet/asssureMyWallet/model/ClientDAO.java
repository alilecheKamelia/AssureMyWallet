package com.projets.innovations.asssurWallet.asssureMyWallet.model;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ClientDAO extends MongoRepository<Client, String>{


        public Client insert(Client client);
        public Client save(Client client);
        public List<Client> findAll();
        public void removeById(String id);
        public Optional<Client> findContratById(@Param("id")String id);

    }
