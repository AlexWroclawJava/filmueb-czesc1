package utils;

import java.util.Locale;
import java.util.Scanner;

import data.Film;
import data.Aktor;
import data.Serial;


public class ConsoleDataReader {
    private Scanner sc;

    public ConsoleDataReader() {
        sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
    }

    public void close() {
        sc.close();
    }

    public Film createMovie() {

        System.out.println("Wprowadź nazwę filmu: ");
        String name1 = sc.nextLine();
        System.out.println("Wprowadź gatunek filmu: ");
        String genre1 = sc.nextLine();
        System.out.println("Wprowadź opis filmu: ");
        String description1 = sc.nextLine();
        System.out.println("Podaj ocenę filmu w skali od 1.0 do 10.0 :");
        Double score1 = sc.nextDouble();
                        sc.nextLine();
        if (score1 < 1.0 || score1 > 10.0) {
            System.out.println("Nie udało się wprowadzić obiektu");
            return null;
        }
        System.out.println("Podaj reżysera filmu: ");
        String director = sc.nextLine();
        System.out.println("Podaj rok produkcji filmu: ");
        Integer year = sc.nextInt();

        return new Film(name1, genre1, description1, score1, director, year);
    }


    public Serial createTvSeries() {

        System.out.println("Wprowadź nazwę serialu: ");
        String nazwa = sc.next();
        sc.nextLine();
        System.out.println("Wprowadź gatunek serialu: ");
        String gatunek = sc.nextLine();
        System.out.println("Wprowadź opis serialu: ");
        String opis = sc.nextLine();
        System.out.println("Podaj ocenę serialu w skali od 1.0 do 10.0 :");
        Double ocena = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj producenta serialu: ");
        String producent = sc.nextLine();
        System.out.println("Podaj ile sezonów ma ten serial: ");
        Integer ilosc_sezonow = sc.nextInt();
        System.out.println("Podaj ile łącznie odcinków ma ten serial: ");
        Integer ilosc_odcinkow = sc.nextInt();

            if ( ilosc_odcinkow <= 0 || ilosc_sezonow <=0){
                System.out.println("Nie udało się wprowadzić obiektu");
                return null;
            }

        return new Serial(nazwa, gatunek, opis, ocena, producent, ilosc_sezonow, ilosc_odcinkow);
    }

    public Aktor createActor() {
        System.out.println("Wprowadź imię aktora: ");
        String name = sc.next();
        sc.nextLine();
        System.out.println("Wprowadź nazwisko aktora: ");
        String lastname = sc.next();
        System.out.println("Podaj kraj pochodzenia aktora: ");
        String country_of_origin = sc.next();

        return new Aktor(name, lastname, country_of_origin);
    }
}
