package it.epicode.springweb.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@AllArgsConstructor
@Getter
@Setter
public class ErrorPaylod {
    private String message;
    private LocalDateTime timestamp;
}
