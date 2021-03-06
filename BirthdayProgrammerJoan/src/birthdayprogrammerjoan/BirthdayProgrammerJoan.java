/*
Joan Diaz
ASIX 1 Monlau
23/02/2021
 */
package birthdayprogrammerjoan;

public class BirthdayProgrammerJoan {

    public static void main(String[] args) {
        int Dia, Mes, Any;
        Dia =13;
        Mes = 9;
        Any = 2021;

        String date=inicioDiaMesZeller(Dia, Mes, Any);
        
        System.out.println("Day of the week: "+date+" Sep 2021");
    }

    private static String inicioDiaMesZeller(int day, int month, int year) {
        String[] ArrayWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        int a, y, m, d;
        a = (14 - month) / 12;
        y = year - a;
        m = month + 12 * a - 2;
        d = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        return ArrayWeek[d];
    }
}
