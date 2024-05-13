import data.Catalogo;
import data.Libri;
import servizi.FileArchivio;


public class Main {

    public static void main(String[] args) {
        var FileArchivio = new FileArchivio();
        Libri libro = new Libri(1,"ciao",2020,20,"io","bello");
        Libri libro2 = new Libri(2,"emily", 1996,500,"lei","capo");
        Libri libro3 = new Libri(4,"ultimo dominatore",1995,25,"lui","brutto");

        FileArchivio.save(libro);
        FileArchivio.save(libro2);
        FileArchivio.save(libro3);
        //FileArchivio.getByISBN(4);
        //FileArchivio.getByAnno(1995);
        //FileArchivio.getByAutore("lui");
        System.out.println(FileArchivio.getByTitoloPart("c"));



    }
}