import data.Catalogo;
import data.Libri;
import servizi.FileArchivio;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Libri libro2 = new Libri("dario",1945,66,"io","avventura");
        Libri libro = new Libri("mario",2010,10,"io","disperazione");
        Libri libro3 = new Libri("simone",2000,10,"boo","bello");

        FileArchivio archivio = new FileArchivio();
        archivio.add(libro);
        archivio.getByAutore("io");
        archivio.add(libro2);
        archivio.add(libro3);
        archivio.load();
        //archivio.deleteISBN(2);


        //archivio.deleteISBN(1);
        //archivio.getByISBN(1);
        //System.out.println(archivio.getLista());



    }
}
