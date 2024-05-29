package it.epicode.verificaSpring.services.exceptions;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;

public class DipendenteNotFoundException extends ApiException {
	private static final long serialVersionUID = 1L;

	public DipendenteNotFoundException(List<ObjectError> errors) {
		super(errors, HttpStatus.NOT_FOUND, "Dipendente non trovato");
	}

}
