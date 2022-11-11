package com.example.ExamQuestionService.Service;

import com.example.ExamQuestionService.Model.Question;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExamServiceImplTest {
    private final JavaQuestionService javaQuestionServiceMock = mock(JavaQuestionService.class);
    @InjectMocks
    private ExamServiceImpl service;
    private final Question q = new Question("q", "hello");
    private final Set<Question> testList = new HashSet<>();

    @Test
    void getQuestions() {
        testList.add(q);
        when(javaQuestionServiceMock.getRandomQuestion()).thenReturn(q);
        assertEquals(service.getQuestions(1), testList);

    }

}