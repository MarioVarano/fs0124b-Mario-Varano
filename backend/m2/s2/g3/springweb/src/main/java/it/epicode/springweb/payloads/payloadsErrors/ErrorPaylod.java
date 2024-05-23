package it.epicode.springweb.payloads.payloadsErrors;

import java.util.Date;

public record ErrorPaylod(
        String message,
        Date timestamp) {

    public ErrorPaylod(String message, Date timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }
}

