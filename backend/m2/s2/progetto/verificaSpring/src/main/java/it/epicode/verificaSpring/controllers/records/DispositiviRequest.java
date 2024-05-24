package it.epicode.verificaSpring.controllers.records;

import it.epicode.verificaSpring.entities.Dipendenti;
import it.epicode.verificaSpring.enums.StatoDispositivo;
import it.epicode.verificaSpring.enums.TipoDispositivo;
import jakarta.validation.constraints.NotNull;

public record DispositiviRequest(
        @NotNull(message = "Tipo è obbligatorio")
        TipoDispositivo tipo,
        @NotNull(message = "Stato del dispositivo è obbligatorio")
        StatoDispositivo stato,
        @NotNull(message = "dipendente deve esserci")
        Dipendenti dipendente) {

}
