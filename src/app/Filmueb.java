package app;

import data.Aktor;
import data.Film;
import data.Serial;
import utils.ConsoleDataReader;

public class Filmueb {

    public static void main(String[] args) {
        final String appVersion2 = "aplikacja ver 0.2";

        System.out.println(appVersion2);

        ConsoleDataReader consoleDataReader = new ConsoleDataReader();
        Film[] films = new Film[3];
        Serial[] serials = new Serial[3];
        Aktor[] aktors = new Aktor[3];


        System.out.println("\nWprowadź dane nowego filmu poniżej: ");
        films[0]=consoleDataReader.createMovie();

        System.out.println("\nWprowadź dane nowego serialu poniżej: ");
        serials[0] = consoleDataReader.createTvSeries();

        System.out.println("\nWprowadź dane aktora: ");
        aktors[0] = consoleDataReader.createActor();
        consoleDataReader.close();

        System.out.println("\nAktualna zawartość Filmueb'u\n");
        System.out.print("Filmy: ");
        if (films[0].printInfo() == null){
            System.out.println("Nie udało się wprowadzić obiektu filmowego");
        }
        films[0].printInfo();

        System.out.print("Seriale: ");
        serials[0].printInfo();
        System.out.print("Aktorzy: ");
        aktors[0].printInfo();
    }
}

