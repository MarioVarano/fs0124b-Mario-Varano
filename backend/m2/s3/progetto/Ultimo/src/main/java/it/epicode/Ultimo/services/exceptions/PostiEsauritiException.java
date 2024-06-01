package it.epicode.Ultimo.services.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;

import java.time.LocalDateTime;
import java.util.List;

public class PostiEsauritiException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public final LocalDateTime accaduta;


    public PostiEsauritiException(String message) {
        super(message);
        this.accaduta = LocalDateTime.now();

    }
}
