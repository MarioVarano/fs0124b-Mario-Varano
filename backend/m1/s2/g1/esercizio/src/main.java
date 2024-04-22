import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class main {
    private static final Logger logger = LoggerFactory.getLogger(esercizio2.class);

    public static void main(String[] args) {


      //esercizio1 e = new esercizio1();
      try {
          esercizio2 e2 = new esercizio2();
      }catch (litriZero l){
          logger.error("litri insufficenti");
      }

    }
}
