package com.example.ExamQuestionService.Service;

import com.example.ExamQuestionService.Model.Question;

import java.util.Collection;

public interface ExamService {
    Collection<Question> getQuestions(int amount);
}
