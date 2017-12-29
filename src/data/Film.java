package data;

public class Film {

    private String nazwa;
    private String gatunek;
    private String opis;
    private double ocena;
    private String rezyser;
    private int rok_produkcji;

    public Film(String nazwa, String gatunek, String opis, double ocena, String rezyser, int rok_produkcji) {
        this.nazwa = nazwa;
        this.gatunek = gatunek;
        this.opis = opis;
        this.ocena = ocena;
        this.rezyser = rezyser;
        this.rok_produkcji = rok_produkcji;
    }

    public Film(Film film){
        this(film.nazwa, film.gatunek, film.opis, film.ocena, film.rezyser, film.rok_produkcji);
    }


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public String getRezyser() {
        return rezyser;
    }

    public void setRezyser(String rezyser) {
        this.rezyser = rezyser;
    }

    public int getRok_produkcji() {
        return rok_produkcji;
    }

    public void setRok_produkcji(int rok_produkcji) {
        this.rok_produkcji = rok_produkcji;
    }

    public String printInfo() {
        return "\nnazwa: " + getNazwa() + "; " + "\ngatunek: " + getGatunek() + "; " + "\nopis: " + getOpis() + "; " + "\nocena: " + getOcena() + "/10.0" + "; "
                       + "\nreżyser: " + getRezyser() + "; " + "\nrok produkcji: " + getRok_produkcji();
    }
}
