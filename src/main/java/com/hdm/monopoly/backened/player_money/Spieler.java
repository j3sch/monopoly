package com.hdm.monopoly.backened.player_money;

import com.hdm.monopoly.backened.player_money.Bank;
import com.hdm.monopoly.backened.player_money.Konto;


public class Spieler {


    private Konto konto;
    private String name;
    private String colour;
    private int ID;
    private Spieler previousPlayer;

    public Spieler(int ID, String name, String colour) {

        this.konto = new Konto(3000);
        this.name = name;
        this.colour = colour;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Spieler getPreviousPlayer() {
        return previousPlayer;
    }

    public void setPreviousPlayer(Spieler previousPlayer) {
        this.previousPlayer = previousPlayer;
    }

    //Nach jeder Änderung des Kontostandes wird der neue Kontostand über das return statement zurückgegeben.
    //Falls wir später eine Anzeige des Kontostandes haben, kann man die Anzeige mit den Returnstatments aktualisieren


    public int spielerErhaeltGeld(int betrag){
        konto.geldGutschreiben(betrag);
        return konto.getKontostand();
    }

    public int spielerZahltGeld(int betrag){
        konto.geldAbziehen(betrag);
        return konto.getKontostand();
    }
}
