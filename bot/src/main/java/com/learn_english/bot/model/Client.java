package com.learn_english.bot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Generated;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(collection = "clients")
public class Client implements Serializable {
    @Id
    int id;
    String name;
    List<Integer> wordsIds;


}
