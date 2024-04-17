package Esercizio3;

public class Rettangolo {
    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }


    public int perimetro(){
       return (this.altezza + this.larghezza) * 2;
    }

    public int area(){
       return this.altezza * this.larghezza;
    }

    private int altezza;
    private int larghezza;
}
