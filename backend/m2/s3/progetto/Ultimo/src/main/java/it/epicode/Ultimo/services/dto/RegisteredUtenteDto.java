package it.epicode.Ultimo.services.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class RegisteredUtenteDto {
    private long id;
    private String nome;
    private String email;
    private String ruoli;

    @Builder(setterPrefix = "with")
    public RegisteredUtenteDto(long id, String nome, String email, String ruoli) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.ruoli = ruoli;
    }
}
