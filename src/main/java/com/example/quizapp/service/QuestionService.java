package com.example.quizapp.service;

import com.example.quizapp.dao.Question;
import com.example.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        questionDao.getAllQustions();
    }
}
