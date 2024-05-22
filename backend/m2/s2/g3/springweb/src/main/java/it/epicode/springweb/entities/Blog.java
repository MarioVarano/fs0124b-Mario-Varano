package it.epicode.springweb.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "blog_generator")
    @SequenceGenerator(name = "blog_generator", sequenceName = "blog_generator")
    private Long id;
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private double tempoLettura;


    @ManyToOne
    @JoinColumn(name = "autoreId")
    private Autore autore;
}
