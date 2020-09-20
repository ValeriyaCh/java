package com.learn_english.bot.controller;

import com.learn_english.bot.model.Client;
import com.learn_english.bot.model.DataModel;
import com.learn_english.bot.model.Word;
import com.learn_english.bot.service.ClientDataService;
import com.learn_english.bot.service.WordDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/router")
public class WordController {
    @Autowired
    WordDataService wordDataService;
    ClientDataService clientDataService;

    @GetMapping("/getClientsWords")
    public DataModel getWordsByClient(@RequestParam(value = "clientData") DataModel clientData){
        Client client = clientDataService.findClient(clientData);
        List<Integer> wordsIds = client.getWordsIds();
        for ( int id : wordsIds){
            Word word = wordDataService.getWordById(id);
            clientData.addNewWord(Pair.of(word.getRussianWord(), word.getEnglishWord()));
        }
        return clientData;
    }

    @GetMapping("/saveClientsWords")
    public DataModel saveWordsByClient(@RequestParam(value = "clientData") DataModel clientData){
        clientDataService.checkClientOrAdd(clientData);
        Client client = clientDataService.findClient(clientData);
        for ( Pair<String,String> word : clientData.getWords()){
            wordDataService.checkWordOrAdd(word);
            Word newWord = wordDataService.findByRussianWord(word.getFirst());
            client.addId(newWord.getId());
        }
        return clientData;
    }


}
