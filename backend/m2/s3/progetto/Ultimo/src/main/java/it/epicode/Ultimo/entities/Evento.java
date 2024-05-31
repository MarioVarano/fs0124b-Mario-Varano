package it.epicode.Ultimo.entities;

import it.epicode.Ultimo.entities.Enums.Luoghi;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="eventi")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class Evento extends Base{
    private String titolo;
    private String descrizione;
    private LocalDate data;
    private Luoghi luogo;
    private int numeroPosti;




}
