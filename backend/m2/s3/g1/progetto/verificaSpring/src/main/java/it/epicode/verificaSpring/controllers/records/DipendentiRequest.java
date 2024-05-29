package it.epicode.verificaSpring.controllers.records;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public record DipendentiRequest(
        @NotNull(message = "Username è obbligatorio")
        String username,
        @NotNull(message = "Nome è obbligatorio")
        String name,
        @NotNull(message = "Cognome è obbligatorio")
        String cognome,
        @NotNull(message = "Email è obbligatorio")
        @Email(message = "Indirizzo email non è corretto")
        String email,
        @NotBlank
        @Length(max = 15)
        String password)
        {
}
