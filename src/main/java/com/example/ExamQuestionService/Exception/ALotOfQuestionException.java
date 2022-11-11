package com.example.ExamQuestionService.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ALotOfQuestionException extends RuntimeException {
    public ALotOfQuestionException() {
    }

    public ALotOfQuestionException(String message) {
        super(message);
    }

    public ALotOfQuestionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ALotOfQuestionException(Throwable cause) {
        super(cause);
    }

    public ALotOfQuestionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
