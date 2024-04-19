package Player;

public class Audio extends Multimediale implements Riproducibili {
    private int volume;
    private int durata;
    private static final int minimo = 0;
    private static final int massimo = 10;

    public Audio(String titolo, int volume, int durata){
        super(titolo);
        this.volume = inverti(volume);
        setVolume(volume);
        this.durata = inverti(durata);
//inverto segno se negativo
    }
    public int inverti(int valore){
        if(valore < 0) valore = -valore;
        return valore;
    }

//setto un range per il volume
    private void setVolume(int volume) {
        if (volume >= minimo && volume <= massimo) {
            this.volume = volume;
        } else {
            System.out.println("Il volume deve essere compreso tra " + minimo + " e " + massimo);
        }
    }

//funzione per visualizzare
    @Override
    public void play() {
        String livelloVolume = "";

        for (int i=0; i<volume; i++) {
            livelloVolume += "!";
        };
        for (int i=0; i<durata; i++){
            System.out.println(titolo + ": " + livelloVolume);
        }


    }
    //alzo il volume di 1 se inferiore al massimo che ho impostato

    @Override
    public void alza() {
        if (volume < 10) {
            volume++;
            System.out.println("Volume alzato a " + volume);
        } else {
            System.out.println("Volume già al massimo");
        }
    }

// viceversa di alza ma sempre di uno per volta
    @Override
    public void abbassa() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume abbassato a " + volume);
        } else {
            System.out.println("Volume già al minimo");
        }
    }

    @Override
    public void inizia() {
        play();
    }
}
