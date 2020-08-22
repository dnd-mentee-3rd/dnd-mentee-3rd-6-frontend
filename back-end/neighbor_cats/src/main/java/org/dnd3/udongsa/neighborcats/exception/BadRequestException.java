package org.dnd3.udongsa.neighborcats.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException{

    private static final long serialVersionUID = -7624859101158784205L;

    public BadRequestException(String message){
        super(message);
    }
    
}