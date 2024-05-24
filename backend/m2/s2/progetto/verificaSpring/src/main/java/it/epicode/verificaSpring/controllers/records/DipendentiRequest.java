package it.epicode.verificaSpring.controllers.records;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record DipendentiRequest(
        @NotNull(message = "Username è obbligatorio")
        String username,
        @NotNull(message = "Nome è obbligatorio")
        String name,
        @NotNull(message = "Cognome è obbligatorio")
        String cognome,
        @NotNull(message = "Email è obbligatorio")
        @Email(message = "Indirizzo email non è corretto")
        String email) {
}
