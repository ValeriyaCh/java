package com.learn_english.bot.dao;

import com.learn_english.bot.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientMongoDao extends MongoRepository<Client,Integer> {
    Client getClientById(int id);
    boolean existsById(int id);
}
