package com.learn_english.bot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Generated;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(collection = "dictionary")
public class Word implements Serializable {
    @Id
    @Generated
    int id;
    String russianWord;
    String englishWord;

    public Word(String russianWord, String englishWord) {
        this.englishWord = englishWord;
        this.russianWord = russianWord;
    }

}
