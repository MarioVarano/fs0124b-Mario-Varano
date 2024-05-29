package Esercizio1;

public class UserData {
    private String nomeCompleto;
    private int eta;

    public void setData(DataSource dataSource) {
        nomeCompleto = dataSource.getNomeCompleto();
        eta = dataSource.getEta();
    }


    @Override
    public String toString() {
        return "UserData{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", eta=" + eta +
                '}';
    }
}
