package com.learn_english.bot.service;

import com.learn_english.bot.dao.WordMongoDao;
import com.learn_english.bot.model.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

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

    public boolean existByRussianWord(String russianWord){
        return wordMongoDao.existsByRussianWord(russianWord);
    }
    public Word getWordById (int id){
        return wordMongoDao.getWordById(id);
    }

    public Word findByRussianWord(String russianWord){
        return wordMongoDao.findByRussianWord(russianWord);
    }
    public void checkWordOrAdd (Pair<String,String> word) {
        if (!wordMongoDao.existsByRussianWord(word.getFirst())) {
            wordMongoDao.save(new Word(word.getFirst(), word.getSecond()));
        }
    }


    @PostConstruct
    public void init(){
        Word newWord = new Word("coshka","cat");
        wordMongoDao.save(newWord);
    }
}





