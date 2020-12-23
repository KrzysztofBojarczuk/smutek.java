public class Krasomowca {
    public static void main (String[] args) {

        // trzy grupy słów, które będą wybieranie  do zadania (dodaj własne!)
        String[] listaSlow1 = {"architektura wielowarstwowa",
        "30000 metrów", "rozwiązanie B-do-B", "aplikacja kliencka",
        "interfejs internetowy", "inteligętna karta", "rozwiązanie dynamieczne",
        "sześć sigma", "przenikliwość"};

        String[] listaSlow2 = {"zwiększa możliwosć", "poprawia atrakcyjnośc",
        "pomnaża wartośc", "opracowana dla", "bazująca na", "rozproszona",
        "sieciowa", "skoncentrowana na", "podniesiona na wyższ poziom",
        "skierowanej", "udostępniona"};

        String[] listaSlow3 = {"procesu", "punktu wpisywania", "rozwiązania",
        "strategii", "paradygmatu", "portalu", "witryny", "wersji", "misji"};

        //określenie, ile jest słów w każdej z list
        int lista1Dlugosc = listaSlow1.length;
        int lista2Dlugosc = listaSlow2.length;
        int lista3Dlugosc = listaSlow3.length;

        //generacja trzech lsowych słow (lub zwrotów)
        int rnd1 = (int) (Math.random() * lista1Dlugosc);
        int rnd2 = (int) (Math.random() * lista2Dlugosc);
        int rnd3 = (int) (Math.random() * lista3Dlugosc);

        //stworzenie zdania
        String zdanie = listaSlow1[rnd1] + " " + listaSlow2[rnd2] +
                " " + listaSlow3[rnd3];

        // wyświetlenie zdania
        System.out.println("to jest to, czego nam trzeba: " + zdanie);
    }
}
