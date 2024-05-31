package it.epicode.Ultimo.controllers.records;

import it.epicode.Ultimo.entities.Enums.Luoghi;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record EventoRequest(
        @NotNull(message = "Nome evento è obbligatorio")
        String nome,
        @NotNull(message = "Descrizione evento è obbligatoria")
        String descrizione,
        @NotNull(message = "Data evento è obbligatoria")
        LocalDate data,
        @NotNull(message = "Luogo è obbligatorio")
        Luoghi luogo,
        @NotNull(message = "Numero posti è obbligatorio")
        @Min(value = 1, message = "Il valore deve essere almeno 1")
        int numeroPosti
      

) {
}
