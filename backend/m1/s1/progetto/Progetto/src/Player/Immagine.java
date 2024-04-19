package Player;

public class Immagine extends Multimediale implements Visualizza{
    private int luminosità;
    private static final int minimoL = 1;
    private static final int massimoL = 5;

    public Immagine(String titolo, int luminosità){
        super(titolo);
        this.luminosità = inverti(luminosità);
        setLuminosità(luminosità);
    }

    public int inverti(int valore){
        if(valore < 0) valore = -valore;
        return valore;
    }
//setto il massimo della luminosità(funzione uguale a quella del volume)
    private void setLuminosità(int luminosità) {
        if (luminosità >= minimoL && luminosità <= massimoL) {
            this.luminosità = luminosità;
        } else {
            System.out.println("La luminosità deve essere compreso tra " + minimoL + " e " + massimoL);
        }
    }


    public void show(){
        String livelloLuminosità = "";

        for (int i=0; i<luminosità; i++) {
            livelloLuminosità += "!";
        };
        System.out.println(titolo + ": " + livelloLuminosità);
    }

    @Override
    public void inizia() {
        show();

    }
//anche queste sono uguali a quelle del volume con cambiamenti dei dati
    @Override
    public void aumentaLuminosità() {
        if (luminosità < 5) {
            luminosità++;
            System.out.println("Luminosità alzato a " + luminosità);
        } else {
            System.out.println("Luminosità già al massimo");
        }
    }

    @Override
    public void diminuisciLuminosità() {
        if (luminosità > 1) {
            luminosità--;
            System.out.println("Luminosità abbassato a " + luminosità);
        } else {
            System.out.println("Luminosità già al minimo");
        }
    }
}
