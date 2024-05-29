package it.epicode.verificaSpring.services.exceptions;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;

public class BadRequestException extends ApiException {
	private static final long serialVersionUID = 1L;

	public BadRequestException(List<ObjectError> errors) {
		super(errors, HttpStatus.BAD_REQUEST, "Bad request");
	}

}
