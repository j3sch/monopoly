package com.hdm.monopoly.backend.board.streets;

public class Street {
//Eigenschaften
//Properties

    private String streetName;
    private boolean sold;
    private int price;
    private int rent;
    private String color;

//Konstruktor
//Constructor
    public Street(String streetName, boolean sold, int price, int rent, String color) {
        this.streetName = streetName;
        this.sold = sold;
        this.price = price;
        this.rent = rent;
        this.color = color;
    }
//Methods
//Getter
    public String getStreetName() {
        return streetName;
    }

    public boolean isSold() {
        return sold;
    }

    public int getPrice() {
        return price;
    }

    public int getRent() {
        return rent;
    }

    public String getColor() {
        return color;
    }

//Setter


    public void setSold(boolean sold) {
        this.sold = sold;
    }
}
