package com.mnunes.hr.exception.handler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
public class ErrorDTO {

    private HttpStatus status;
    private String message;


}
