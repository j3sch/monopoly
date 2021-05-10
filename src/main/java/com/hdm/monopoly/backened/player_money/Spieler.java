package com.hdm.monopoly.backened.player_money;

import com.hdm.monopoly.backened.player_money.Bank;
import com.hdm.monopoly.backened.player_money.Konto;

public class Spieler {


    private Konto konto;

    public Spieler() {

        this.konto = new Konto(3000);
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
