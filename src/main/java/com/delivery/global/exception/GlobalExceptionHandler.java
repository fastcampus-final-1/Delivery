package com.delivery.global.exception;

import com.delivery.global.api.API;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(GlobalException.class)
    public ResponseEntity errorResponse(
            GlobalException ex
    ) {
        ex.exceptionHandling();
        return API.ERROR(ex);
    }

}
