package it.epicode.springweb.exception;


import it.epicode.springweb.payloads.payloadsErrors.ErrorPayloadsList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@RestControllerAdvice
public class ExceptionsHandler {


    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorPayloadsList handleBadRequest(BadRequestException e){
        List<String> errorsMessage = new ArrayList<>();
        if(e.getErrorList() != null)
            errorsMessage = e.getErrorList().stream()
                    .map(err -> err.getDefaultMessage()).toList();
        return new ErrorPayloadsList(e.getMessage(),new Date(),errorsMessage);
    }


    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorPaylod handleNotFound(NotFoundException e){
        return new ErrorPaylod(e.getMessage(), LocalDateTime.now());
    }


    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorPaylod handleGeneric(Exception e){
        e.printStackTrace();
        return new ErrorPaylod("Errore generico", LocalDateTime.now());
    }



}
