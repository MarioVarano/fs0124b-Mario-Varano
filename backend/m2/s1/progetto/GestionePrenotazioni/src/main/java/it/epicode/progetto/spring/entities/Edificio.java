package it.epicode.progetto.spring.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "edifici")
@Builder(setterPrefix = "with")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Edificio extends Base{
    private String name;
    private String indirizzo;
    private String citta;
}
