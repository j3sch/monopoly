package org.monopoly;

public class Konto {

    private int kontostand;


    public Konto(int kontostand) {
        this.kontostand = kontostand;
    }

    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }

    public void geldGutschreiben( int betragHöhe){

      setKontostand(getKontostand()+ betragHöhe);
    };

    public void geldAbziehen( int betragHöhe){
        setKontostand(getKontostand()-betragHöhe);
    };

}
