package it.epicode.verificaSpring.entities.DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(setterPrefix = "with")
@AllArgsConstructor
public class DipeRegister extends Dtobase {
    private String username;
    private String name;
    private String cognome;
    private String email;
    private String password;
}
