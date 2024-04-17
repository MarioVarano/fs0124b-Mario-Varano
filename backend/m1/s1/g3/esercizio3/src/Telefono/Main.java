package Telefono;

import static Telefono.Sim.stampaSim;

public class Main {




    public static void main(String[] args) {
        Sim mia = new Sim("3295630484");
        mia.setCredito(20);
        stampaSim(mia);

    }
}
