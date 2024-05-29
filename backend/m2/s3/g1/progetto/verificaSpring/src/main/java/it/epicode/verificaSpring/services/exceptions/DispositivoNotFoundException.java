package it.epicode.verificaSpring.services.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;

import java.util.List;

public class DispositivoNotFoundException extends ApiException{
    private static final long serialVersionUID = 1L;

    public DispositivoNotFoundException(List<ObjectError> errors) {
        super(errors, HttpStatus.NOT_FOUND, "Dispositivo non trovato");
    }

}
