package com.example.ExamQuestionService.Service;

import com.example.ExamQuestionService.Model.Question;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class JavaQuestionService implements QuestionService {
    private final Set<Question> questions = new HashSet<>();
    @Override
    public Question add(String question, String answer) {
        Question q = new Question(question, answer);
        if (questions.contains(q)) {
            throw new RuntimeException();
        }
        questions.add(q);
        return q;
    }

    @Override
    public Question remove(String question, String answer) {
        Question q = new Question(question, answer);
        if (questions.contains(q)) {
            questions.remove(q);
            return q;
        }
        throw new RuntimeException();
    }

    @Override
    public Collection<Question> getAll() {
        return questions.stream()
                .sorted(Comparator.comparing(Question::getQuestion))
                .collect(Collectors.toList());
    }

    @Override
    public Question getRandomQuestion() {
        Random ran = new Random();
        int nxt = ran.nextInt(questions.size()+1);
        Question[] quesArray = questions.toArray(new Question[questions.size()]);
        return quesArray[nxt];
    }
}
