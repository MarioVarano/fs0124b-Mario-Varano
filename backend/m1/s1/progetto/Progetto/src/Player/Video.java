package Player;

public class Video extends Multimediale implements Riproducibili, Visualizza{
    private int volume;
    private int durata;
    private int luminosità;
    private static final int minimoV = 0;
    private static final int massimoV = 10;
    private static final int minimoL = 1;
    private static final int massimoL = 5;
//uso per ogni oggetto un costruttore per istanziare l'oggetto
    public Video(String titolo,int volume, int durata, int luminosità) {
        super(titolo);
        this.volume = inverti(volume);
        this.luminosità = inverti(luminosità);
        setVolume(volume);
        setLuminosità(luminosità);
        this.durata = inverti(durata);

    }

    public int inverti(int valore){
        if(valore < 0) valore = -valore;
        return valore;
    }

    private void setVolume(int volume) {
        if (volume >= minimoV && volume <= massimoV) {
            this.volume = volume;
        } else {
            System.out.println("Il volume deve essere compreso tra " + minimoV + " e " + massimoV);
        }
    }

    private void setLuminosità(int luminosità) {
        if (luminosità >= minimoL && luminosità <= massimoL) {
            this.luminosità = luminosità;
        } else {
            System.out.println("La luminosità deve essere compreso tra " + minimoL + " e " + massimoL);
        }
    }

    @Override
    public void inizia() {
        play();
    }

    @Override
    public void play() {
        String livelloVolume = "";
        String livelloLuminosità = "";

        for (int i=0; i<volume; i++) {
            livelloVolume += "!";
        };
        for(int i=0; i<luminosità; i++){
            livelloLuminosità += "*";
        };
        for (int i=0; i<durata; i++){
            System.out.println(titolo + ": " + livelloVolume + livelloLuminosità);
        }

    }

    @Override
    public void alza() {
        if (volume < 10) {
            volume++;
            System.out.println("Volume alzato a " + volume);
        } else {
            System.out.println("Volume già al massimo");
        }
    }

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
