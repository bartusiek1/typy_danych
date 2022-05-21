package pl.arp4.typydanych;

public class MainString {
    public static void main(String[] args) {

        System.out.println("ala"=="ala");       // wynik: true

        String zmiennaA = "ala";
        String zmiennaB = new String ("ala");
        String zmiennaC = new String ("ala");
        String zmiennaD = "ala";

        // new String rezerwuje oddzielny adres w pamięci, więc zmiennaA, choć ma taką samą wartość jak zmiennaB
        // to nie jest to samo co zmiennaB, bo to są dwa różne adresy w pamięci

        // ale zmiennaA i zmiennaD odwołuje się już do tego samego miejsca w pamięci, tzn. zmiennaD, odwołuje się
        // do tego samego adresu w pamięci, które zajmuje zmiennaA

        System.out.println(zmiennaA == zmiennaB);   // false
        System.out.println(zmiennaB == zmiennaC);   // false
        System.out.println(zmiennaA == zmiennaD);   // true
        System.out.println(zmiennaC == zmiennaD);   // false

        // Ale jeśli użyjemy operatora .equals, suytaucja zmienia się diamertralnie,
        // bo porównywany nie jest już adres pamięci, ale stricte wskazany w cudzysłowiu tekst

        System.out.println(zmiennaA.equals(zmiennaB));   // true
        System.out.println(zmiennaA.equals(zmiennaC));  // true
        System.out.println(zmiennaA.equals(zmiennaD));  // true

        String zmiennaE = "ala ";
        String zmiennaF = "Ala";

        // "ala" vs. "ala "
        System.out.println(zmiennaA.equals(zmiennaE));  // false - treść nie jest ta sama, bo zmiennaE ma dodatkową spację

        // "ala" vs. "Ala"
        System.out.println(zmiennaA.equals(zmiennaF));  // false - treść nie jest taka sama, bo zmiennaF jest z dużej litery

        // porównywanie treści bez względu na wielkość liter

        System.out.println(zmiennaA.equalsIgnoreCase(zmiennaF));    // true, bo użyta wielkość liter jest tu ignorowana

    }
}
