package com.hdm.monopoly.backend.board.streets;

import com.hdm.monopoly.backend.player_money.Player;

public class Street implements Field {
//Eigenschaften
//Properties

    private String streetName;
    private int price;
    private int rent;
    private Color color;
    private Player owner;


    //Konstruktor
//Constructor


    public Street(String streetName, int price, int rent, Color color) {
        this.streetName = streetName;
        this.price = price;
        this.rent = rent;
        this.color = color;
    }

    //Methods
    @Override
    public void moveOnField(Player player) {
        if (owner == null) {
            //TODO ask player if he wants to buy that field
        } else {
            //player on field has to pay rent to the owner
            if(player != owner){
                player.PlayerPaysMoney(rent);
                owner.PlayerGetsMoney(rent);
                //TODO send Messages to players for losing money and receiving money
            }
        }
    }
    //Getter
    @Override
    public String getFieldName() {
        return streetName;
    }

    public int getPrice() {
        return price;
    }

    public int getRent() {
        return rent;
    }

    public Color getColor() {
        return color;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }



}
