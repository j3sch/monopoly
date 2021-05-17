package com.hdm.monopoly.backened.board.street_test;

import com.hdm.monopoly.backened.player_money.Spieler;

public class Street implements Field {
    private String streetName;
    private Spieler owner;
    private int price;
    private int rent;
    private Color color;


    public enum Color {
        Brown,
        LightBlue,
        Pink,
        Orange,
        Red,
        Yellow,
        Green,
        DarkBlue
    }

    public Street(String streetName, int price, int rent, Color color) {
        this.streetName = streetName;
        this.owner = null;
        this.price = price;
        this.rent = rent;
        this.color = color;
    }

    public void moveOnField(Spieler player) {
        if (owner == null) {
            //ask player if he wants to buy that field
        } else {
            //player on field has to pay rent to the owner
        }
    }
}