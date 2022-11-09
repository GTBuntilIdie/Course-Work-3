package com.example.ExamQuestionService.Service;

import com.example.ExamQuestionService.Model.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(String question, String answer);
    Question remove(String question, String answer);
    Collection<Question> getAll();
    Question getRandomQuestion();
}
