public class Filmueb {

    public static void main(String[] args) {

        Film film = new Film("Człowiek ze Stali (ang. Man of Steel)","Sci-Fi","Młodzieniec o imieniu Clark, na codzień pracujący w wydawnictwie prasowym, ma świadomość, " +
                             "że nie pochodzi z ziemi i posiada nadprzyrodzone moce. Wkrótce zaczyna się batalia o ludzkość", "4.8 / 5.0","Zack Snyder", 2013);

        Serial serial = new Serial( "Nie z tego świata (ang. Supernatural)", "Dramat-Horror", "Dwoje młodych chłopaków traci na polowaniu ojca," +
                                   " wkrótce ruszają na poszukiwania przez klika stanów, na drodze napotykając niewytłumaczalne zjawiska", "4.9 / 5.0","Eric Kripke", 13, 273);

        Aktor aktor = new Aktor("Arnold", "Schwarzenneger", "USA");

        System.out.println("aplikacja ver 0.1");
        System.out.println("Filmy, seriale oraz dane aktorów dostępne w Filmueb'ie\n");

        System.out.print("Filmy: ");
        film.printInfo();
        System.out.print("Seriale: ");
        serial.printInfo();
        System.out.print("Aktorzy: ");
        aktor.printInfo();

    }
}
