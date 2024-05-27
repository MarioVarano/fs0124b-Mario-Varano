package it.epicode.verificaSpring.controllers.records;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record DipendentiRegisterModel(
        @NotBlank @Length(max = 125) String username, //
        @NotBlank @Length(max = 15) String password
        ) {
}
