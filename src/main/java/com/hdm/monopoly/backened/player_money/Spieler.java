package com.hdm.monopoly.backened.player_money;

import com.hdm.monopoly.backened.player_money.Bank;
import com.hdm.monopoly.backened.player_money.Konto;

public class Spieler {

    Bank bank;
    Konto konto;

    public Spieler() {
        this.bank = new Bank();
        this.konto = new Konto(bank.getStartkapital());
    }

    //Nach jeder Änderung des Kontostandes wird der neue Kontostand über das return statement zurückgegeben.
    //Falls wir später eine Anzeige des Kontostandes haben, kann man die Anzeige mit den Returnstatments aktualisieren

    public int spielerUeberLos(){
        konto.geldGutschreiben(bank.getUeberLos());
        return konto.getKontostand();
    }
    public int spielerGenauAuflos(){
        konto.geldGutschreiben(bank.getGenauAufLos());
        return konto.getKontostand();
    }
    public int spielerKauftGrundstück(){
        konto.geldAbziehen(100); //Die 100 ist nur ein Beispielbetrag hier wird später die Variable des Grundstückpreises Übergeben
        return konto.getKontostand();
    }

    public int spielerZahltMiete(){
        konto.geldAbziehen(10); //Die 10 ist nur ein Beispielbetrag hier wird später die Variable der zu zahlenden Miete übergeben
        return konto.getKontostand();
    }
    public int spielerErhaeltMiete(){
        konto.geldGutschreiben(10); //Die 10 ist nur ein Beispielbetrag hier wird später die Variable der zu erhaltenden Miete übergeben
        return konto.getKontostand();
    }
}
