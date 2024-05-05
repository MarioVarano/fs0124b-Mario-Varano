package data;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import javax.xml.crypto.Data;


public class Utente extends Base {
    private String nome;
    private String cognome;
    private Data dataDiNascita;
    private long numeroDiTessera;

    public Utente() {
    }


    public Utente( String nome, String cognome, Data dataDiNascita, long numeroDiTessera) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.numeroDiTessera = numeroDiTessera;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Data getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(Data dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public long getNumeroDiTessera() {
        return numeroDiTessera;
    }

    public void setNumeroDiTessera(long numeroDiTessera) {
        this.numeroDiTessera = numeroDiTessera;
    }

    @Override
    public String toString() {
        return  super.toString() + "Utente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                ", numeroDiTessera=" + numeroDiTessera +
                '}';
    }
}
