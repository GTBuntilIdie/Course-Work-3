package com.example.ExamQuestionService.Controller;

import com.example.ExamQuestionService.Model.Question;
import com.example.ExamQuestionService.Service.ExamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
@RestController
public class ExamController {
    private final ExamService examService;

    public ExamController(ExamService examService) {
        this.examService = examService;
    }
    @GetMapping("/exam")
    public Collection<Question> getQuestions(@RequestParam int amount) {
        return examService.getQuestions(amount);
    }
}
