package com.learn_english.bot.controller;

import com.learn_english.bot.model.Word;
import com.learn_english.bot.service.WordDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/word")
public class WordController {
    @Autowired
    WordDataService wordDataService;

    @GetMapping("/getAllWords")
    public List<Word> getAll(){
        return wordDataService.getAllWords();
    }


}
