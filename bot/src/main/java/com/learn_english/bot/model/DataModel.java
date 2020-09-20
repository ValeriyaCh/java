package com.learn_english.bot.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.util.Pair;

import java.util.List;

@Setter
@Getter
public class DataModel {
    private int chatID;
    private int userID;
    private List<Pair<String,String>> words;

    public void addNewWord (Pair<String,String> word){
        words.add(word);
    }

}