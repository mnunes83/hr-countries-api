package com.mnunes.hr.exception.handler;

import com.mnunes.hr.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    private ResponseEntity<ErrorDTO> notFoundExceptionHandler(NotFoundException exception) {

        ErrorDTO errorDTO = this.buildError(HttpStatus.NOT_FOUND, exception.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorDTO);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDTO> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {

        ErrorDTO errorDTO = this.buildError(HttpStatus.BAD_REQUEST,exception.getBindingResult().getFieldError().getDefaultMessage());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorDTO);
    }

    private ErrorDTO buildError(HttpStatus status, String message) {
        return  new ErrorDTO(status, message);
    }
}
