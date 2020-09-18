package com.learn_english.bot.service;

import com.learn_english.bot.dao.WordMongoDao;
import com.learn_english.bot.model.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Service
public class WordDataService {
    @Autowired
    private final WordMongoDao wordMongoDao;

    public WordDataService(WordMongoDao wordMongoDao) {
        this.wordMongoDao = wordMongoDao;
    }

    public List<Word> getAllWords(){
        return wordMongoDao.findAll();
    }

    public void addWord(Word newWord){
        wordMongoDao.save(newWord);
    }

    public void deleteWord(Word word) {
        wordMongoDao.delete(word);
    }

    public Optional<Word> getWordById(int id){
        return wordMongoDao.findById(id);
    }


    @PostConstruct
    public void init(){
        Word newWord = new Word("coshka","cat");
        wordMongoDao.save(newWord);
    }
}





