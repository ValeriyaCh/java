package com.learn_english.bot.service;

import com.learn_english.bot.dao.ClientMongoDao;
import com.learn_english.bot.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientDataService {
    @Autowired
    private ClientMongoDao clientMongoDao;

    public ClientDataService(ClientMongoDao clientMongoDao) {
        this.clientMongoDao = clientMongoDao;
    }

    public List<Client> getAllClients(){
        return clientMongoDao.findAll();
    }
    public Client getClientById(int id){
        return clientMongoDao.getClientById(id);
    }
    public void addNewIds(int id){
        clientMongoDao.addId(id);
    }

}
