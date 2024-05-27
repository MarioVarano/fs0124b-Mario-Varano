package it.epicode.verificaSpring.entities.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder(setterPrefix = "with")
public class DipeRegistered {
    private Long id;
    private String username;
    private String email;
}

