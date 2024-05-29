package Esercizio1;

import java.util.Calendar;
import java.util.Date;

public class Program {


    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1995, Calendar.JULY, 9);
        Info info = new Info("Mario","Var", new Date());
        info.setDataNascita(calendar.getTime());
        InfoAdapter adapter = new InfoAdapter(info);
        UserData user = new UserData();
        user.setData(adapter);
        System.out.println(user);

    }
}
