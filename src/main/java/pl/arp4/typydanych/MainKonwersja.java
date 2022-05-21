package pl.arp4.typydanych;

public class MainKonwersja {
    public static void main(String[] args) {
        short zmiennaA = 50;
        int zmiennaAKonwersja = zmiennaA;
        System.out.println(zmiennaAKonwersja);

        short zmiennaB = 51;
        long zmiennaBKonwersja = zmiennaB;
        System.out.println(zmiennaBKonwersja);

        int zmiennaC = 52;
        float zmiennaCKonwersja = zmiennaC;
        System.out.println(zmiennaCKonwersja);

        int zmiennaD = 53;
        double zmiennaDKonwersja = zmiennaD;
        System.out.println(zmiennaDKonwersja);

        //nie da się przeprowadzić konwersji z wartości mniejszą na większą, chyba że to wymusimy na programie:
        long zmiennaE = 300000000581l;
        int zmiennaEKonwersja = (int) zmiennaE;
        System.out.println(zmiennaEKonwersja);

        short zmiennaF = 32000;
        byte zmiennaFKonwersja = (byte) zmiennaF;
        System.out.println(zmiennaFKonwersja);

        char zmiennaG = 'a';
        int zmiennaGKonwersja = zmiennaG;
        System.out.println(zmiennaGKonwersja);

    }
}
