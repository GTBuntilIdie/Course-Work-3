package com.example.ExamQuestionService.Service;

import com.example.ExamQuestionService.Model.Question;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceTest {
    JavaQuestionService javaQuestionService = new JavaQuestionService();


    @Test
    void add() {
        Question actual = new Question("Hello", "World");
        assertEquals(actual, javaQuestionService.add("Hello", "World"));
    }

    @Test
    void remove() {
        Question q = new Question("Hello", "World");
        javaQuestionService.add("Hello", "World");
        assertEquals(q, javaQuestionService.remove("Hello", "World"));

    }

    @Test
    void getAll() {
        Collection<Question> testCollect = new HashSet<>();
        testCollect.add(new Question("Hello", "World"));
        javaQuestionService.add("Hello", "World");
        assertEquals(javaQuestionService.getAll().stream().toList(), testCollect.stream().toList());

    }

    @Test
    void getRandomQuestion() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        Random ran = new Random();
        int nxt = ran.nextInt(set.size());
        Integer[] quesArray = set.toArray(new Integer[set.size()]);
        System.out.println(quesArray[nxt]);
    }
}