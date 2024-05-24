package it.epicode.verificaSpring.entities;

import jakarta.persistence.*;
import lombok.*;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "dipendenti")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class Dipendenti extends Base{
    private String username;
    private String name;
    private String cognome;
    private String email;
}
