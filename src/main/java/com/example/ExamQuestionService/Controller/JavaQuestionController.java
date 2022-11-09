package com.example.ExamQuestionService.Controller;

import com.example.ExamQuestionService.Model.Question;
import com.example.ExamQuestionService.Service.JavaQuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class JavaQuestionController {
    private final JavaQuestionService javaQuestionService;

    public JavaQuestionController(JavaQuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }
    @GetMapping("/exam/java/add")
    public Question add(@RequestParam String question,
                        @RequestParam String answer) {
        return javaQuestionService.add(question, answer);
    }
    @GetMapping("/exam/java/remove")
    public Question remove(@RequestParam String question,
                           @RequestParam String answer) {
        return javaQuestionService.remove(question, answer);
    }
    @GetMapping("/exam/java")
    public Collection<Question> getAll() {
        return javaQuestionService.getAll();
    }

}
