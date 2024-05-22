package it.epicode.springweb.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.http.HttpStatusCode;


@Data
@Builder(setterPrefix = "with")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "autori")
public class Autore{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "autori_generator")
    @SequenceGenerator(name = "autori_generator", sequenceName = "autori_generator")
    private Long id;
    private String nome;
    private String cognome;
    private String email;
    private String dataDiNascita;
    private String avatar;


}
