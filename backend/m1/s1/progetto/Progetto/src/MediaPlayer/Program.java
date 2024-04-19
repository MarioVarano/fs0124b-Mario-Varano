package MediaPlayer;

import Player.Audio;
import Player.Immagine;
import Player.Player;
import Player.Video;
//faccio qualche prova di funzionamento e poi verifico il risultato
public class Program {

    public static void main(String[] args) {
        Audio audio = new Audio("prova", 5,5);
        Video video = new Video("provaV", 4,6,2);
        Immagine img = new Immagine("provaI", 5);
        audio.play();
        video.play();
        img.show();
        Player p = new Player();
        p.impostaParametriDaTastiera();
    }
}
