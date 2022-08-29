package com.absence.details.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandling {

    @ExceptionHandler(value = {ApplicationException.class})
    protected ResponseEntity<Object> handleApplicationConflict(ApplicationException applicationException) {
        return new ResponseEntity<>(new ErrorResponse(applicationException), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = {Exception.class})
    protected ResponseEntity<Object> handleConflict() {
        return new ResponseEntity<>(new ErrorResponse("Error" , "Checking the error flow"), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
