package com.learn_english.bot.service;

import com.learn_english.bot.dao.ClientMongoDao;
import com.learn_english.bot.model.Client;
import com.learn_english.bot.model.DataModel;
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
    public boolean existsById (int id){
        return clientMongoDao.existsById(id);
    }
    public void addNewClient(Client client){
        clientMongoDao.save(client);
    }
    public Client findClient (DataModel clientData){
        return clientMongoDao.getClientById((int) clientData.getUserID());
    }
    public void checkClientOrAdd (DataModel clientData){
        if (!clientMongoDao.existsById(clientData.getUserID())){
            clientMongoDao.save(new Client(clientData.getUserID()));
        }
    }


}
