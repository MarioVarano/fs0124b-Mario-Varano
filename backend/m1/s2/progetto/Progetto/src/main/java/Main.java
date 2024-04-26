import data.Catalogo;
import data.Libri;
import servizi.FileArchivio;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Libri libro2 = new Libri("dario",1945,66,"adolfo","avventura");
        Libri libro = new Libri("mario",2010,10,"io","disperazione");

        FileArchivio archivio = new FileArchivio();
        archivio.add(libro);
        archivio.add(libro2);

        //archivio.deleteISBN(1);
        //archivio.getByISBN(1);
        System.out.print(archivio.getLista());



    }
}
