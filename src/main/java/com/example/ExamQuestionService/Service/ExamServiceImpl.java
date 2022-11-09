package com.example.ExamQuestionService.Service;

import com.example.ExamQuestionService.Exception.ALotOfQuestionException;
import com.example.ExamQuestionService.Model.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
@Service
public class ExamServiceImpl implements ExamService {
    private final Collection<Question> examQuestion = new HashSet<>();
    JavaQuestionService javaQuestionService = new JavaQuestionService();
    @Override
    public Collection<Question> getQuestions(int amount) {
        int i = 0;
        while (i <= amount) {
            Question q = javaQuestionService.getRandomQuestion();
            examQuestion.add(q);
            i++;
        }
        if ( amount > examQuestion.size()) {
            throw new ALotOfQuestionException();
        }
        return examQuestion;

    }

}
