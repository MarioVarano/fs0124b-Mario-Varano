import data.Catalogo;
import data.Libri;
import servizi.FileArchivio;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Libri libro = new Libri("mario",2010,10,"io","disperazione");

        FileArchivio archivio = new FileArchivio();
        archivio.add(libro);
        archivio.deleteISBN(1);
        System.out.println(archivio.getLista());


    }
}
