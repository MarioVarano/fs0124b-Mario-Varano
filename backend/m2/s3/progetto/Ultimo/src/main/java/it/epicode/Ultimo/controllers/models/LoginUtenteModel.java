package it.epicode.Ultimo.controllers.models;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record LoginUtenteModel(
        @NotBlank @Length(max = 125) String nomme, //
        @NotBlank @Length(max = 15) String password) {
}
