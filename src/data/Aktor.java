package data;

public class Aktor {

    private String imie;
    private String nazwisko;
    private String kraj_pochodzenia;

    public Aktor(String imie, String nazwisko, String kraj_pochodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.kraj_pochodzenia = kraj_pochodzenia;
    }

    public Aktor(Aktor aktor){
        this(aktor.imie, aktor.nazwisko, aktor.kraj_pochodzenia);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getKraj_pochodzenia() {
        return kraj_pochodzenia;
    }

    public void setKraj_pochodzenia(String kraj_pochodzenia) {
        this.kraj_pochodzenia = kraj_pochodzenia;
    }

    public void printInfo() {
        String info = getImie() + "; " + "\nnazwisko: " + getNazwisko() + "; " + "\nkraj pochodzenia: " + getKraj_pochodzenia();
        System.out.println(info);
    }
}
