package it.epicode.springweb.payloads;


import jakarta.validation.constraints.NotNull;
import lombok.Getter;


public record BlogPayload (
        @NotNull(message = "Id obbligatorio")
        Long autoreId,
        @NotNull(message = "La categoria è obbligatoria")
        String categoria,
        String contenuto,
        @NotNull(message = "Il tempo di lettura è obbligatoria")
        double tempoLettura,
        @NotNull(message = "Il titolo serve")
        String titolo

){

}



