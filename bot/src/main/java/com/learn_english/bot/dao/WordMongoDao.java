package com.learn_english.bot.dao;

import com.learn_english.bot.model.Word;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WordMongoDao extends MongoRepository<Word,Integer> {
    List<Word> generateWordsForClient(int amount);

}
