package it.epicode.Ultimo.services.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class LoginResponseDto {
    private long id;
    private String nome;
    private String email;
    private String ruoli;
    private String token;

    @Builder(setterPrefix = "with")
    public LoginResponseDto(long id, String nome, String email, String ruoli, String token) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.ruoli = ruoli;
        this.token = token;
    }
}
