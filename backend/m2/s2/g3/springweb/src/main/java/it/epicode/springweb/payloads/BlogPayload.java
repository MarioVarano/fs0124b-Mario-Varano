package it.epicode.springweb.payloads;


import lombok.Getter;

@Getter
public class BlogPayload {
    private Long autoreId;
    private String categoria;
    private String contenuto;
    private double tempoLettura;
    private String titolo;
}
