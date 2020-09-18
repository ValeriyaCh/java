package com.learn_english.bot.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.util.Pair;

import java.util.List;

@Setter
@Getter
public class DataModel {
    private long chatID;
    private long userID;
    private List<Pair<String,String>> words;

}