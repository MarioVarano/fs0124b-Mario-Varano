package it.epicode.verificaSpring.services.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;

import java.util.List;

public class DispositivoNonDisponibileException extends RuntimeException{
    private static final long serialVersionUID = 1L;


    public DispositivoNonDisponibileException(String message) {
        super(message);
    }
}
