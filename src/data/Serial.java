package data;

public class Serial {

    private String nazwa;
    private String gatunek;
    private String opis;
    private double ocena;
    private String producent;
    private int ilosc_sezonow;
    private int ilosc_odcinkow;;


    public Serial(String nazwa, String gatunek, String opis, double ocena, String producent, int ilosc_sezonow, int ilosc_odcinkow) {
        this.nazwa = nazwa;
        this.gatunek = gatunek;
        this.opis = opis;
        this.ocena = ocena;
        this.producent = producent;
        this.ilosc_sezonow = ilosc_sezonow;
        this.ilosc_odcinkow = ilosc_odcinkow;
    }

    public Serial(Serial serial){
        this(serial.nazwa, serial.gatunek, serial.opis, serial.ocena, serial.producent, serial.ilosc_sezonow, serial.ilosc_odcinkow);
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

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public int getIlosc_sezonow() {
        return ilosc_sezonow;
    }

    public void setIlosc_sezonow(int ilosc_sezonow) {
        this.ilosc_sezonow = ilosc_sezonow;
    }

    public int getIlosc_odcinkow() {
        return ilosc_odcinkow;
    }

    public void setIlosc_odcinkow(int ilosc_odcinkow) {
        this.ilosc_odcinkow = ilosc_odcinkow;
    }



    public String printInfo() {
        return "\ntytuł: " + getNazwa() + "; " + "\ngatunek: " + getGatunek() + "; " + "\nopis: " + getOpis() + "; " +
                "\nocena: " + getOcena() + "/10.0" + "; " + "\nproducent: " + getProducent() + "; " + "\nilość sezonów: " + getIlosc_sezonow() + "; " + "\nilość odcinków: " + getIlosc_odcinkow();
    }
}
