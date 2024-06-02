package it.epicode.Ultimo.services.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder(setterPrefix = "with")
public class RegisterUtenteDto {
    private String nome;
    private String password;
    private String email;
    private String ruolo;
}
