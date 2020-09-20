package com.learn_english.bot.dao;

import com.learn_english.bot.model.Word;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordMongoDao extends MongoRepository<Word,Integer> {
    Word findByRussianWord(String russianWord);
    boolean existsByRussianWord(String russianWord);
    Word getWordById(int id);

}
