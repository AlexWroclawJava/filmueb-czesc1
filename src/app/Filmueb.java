package app;

import data.Aktor;
import data.Film;
import data.Serial;
import utils.ConsoleDataReader;

import java.util.Scanner;

public class Filmueb {

    public static void main(String[] args) {
        final String appVersion2 = "aplikacja ver 0.3";

        System.out.println(appVersion2);

        Scanner scanner_menu = new Scanner(System.in);

        ConsoleDataReader consoleDataReader = new ConsoleDataReader();
        Film[] films = new Film[5];
        Serial[] serials = new Serial[5];
        Aktor[] aktors = new Aktor[5];

        int wybor = 0;
        int licznik_seriali = 0;
        int licznik_aktorow = 0;
        int licznik_filmow = 0;
        int i = 0;

        do {
            System.out.println("\nMENU FILMUEB:");
            System.out.println("1. Dodaj nowy film");
            System.out.println("2. Dodaj nowy serial");
            System.out.println("3. Dodaj nowego aktora");
            System.out.println("4. Wyświetl wszystkie dotychczasowe informacje");
            System.out.println("5. Koniec programu");

            System.out.println("\nWybierz od 1 do 5: ");
            wybor = scanner_menu.nextInt();

            switch (wybor) {
                case 1:
                    System.out.println("Wprowadź dane nowego filmu poniżej: ");
                    films[licznik_filmow] = consoleDataReader.createMovie();
                    licznik_filmow++;
                    break;
                case 2:
                    System.out.println("Wprowadź dane nowego serialu poniżej: ");
                    serials[licznik_seriali] = consoleDataReader.createTvSeries();
                    licznik_seriali++;
                    break;
                case 3:
                    System.out.println("Wprowadź dane aktora: ");
                    aktors[licznik_aktorow] = consoleDataReader.createActor();
                    licznik_aktorow++;
                    break;
                case 4:
                    System.out.println("/nBaza wszystkich wprowadzonych informacji do tej pory");

                    System.out.print("\nFilmy: ");
                    for (i = 0; i < licznik_filmow; i++) {
                        System.out.println(films[i].printInfo());
                    }
                    System.out.print("\nSeriale: ");
                    for (i = 0; i < licznik_seriali; i++) {
                        System.out.println(serials[i].printInfo());
                    }
                    System.out.print("\nAktorzy: ");
                    for (i = 0; i < licznik_aktorow; i++) {
                            System.out.println(aktors[i].printInfo());
                    }
                    break;
                case 5:
                    System.out.println("\nKoniec programu");
                    break;
                default:
                    System.out.println("\nNiepoprawny wybór, spróbuj ponownie");
            }
        } while (wybor != 5);
    }
}

