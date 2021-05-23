package com.hdm.monopoly.backend.board.streets;

import java.util.ArrayList;

public class StreetManager {


//Eigenschaften
//properties

final private String[]  streetName = {"Burger Joint", "Pizza House", "Candy Store","Ice Cream Palor","Museum", "Library", "Skate Park", "Swimming Pool", "Video Game Arcade", "Movie Theater", "Toy Store", "Pet Store", "Bowling Alley", "The Zoo", "Park Place", "Boardwalk"};
private boolean[] sold = new boolean[16];
final private int[] price = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,5,5};
final private int[] rent = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,5,5};
final private String[]  color = {"Brown", "Brown", "Light Blue","Light Blue", "Pink", "Pink", "Orange","Orange","Red","Red", "Yellow", "Yellow","Green", "Green" , "Dark Blue", "Dark Blue"};
ArrayList<Street> streets = new ArrayList();

//Constructor
    public StreetManager() {
        this.streetMaker();
    }

//Methods


//For schleife erstellt die Objekte und fügt sie der ArrayListe hinzu.
    public void streetMaker() {
        for(int i = 0; i < 15; ++i) {
            Street street = new Street(this.streetName[i], this.sold[i], this.price[i], this.rent[i], this.color[i]);
            this.streets.add(street);
        }
    }

// Die Methode ermöglicht den Index Zugriff auf eine Straße.
//Bsp:  StreetManager streetManager = new StreetManager();
//      Street aktuell = streetManager.getStreet(0);  hier wird auf den Ondex 0 zugegriffen
//      mit aktuelleStraße.getStreetName() bekommt man den Straßennamen des index 0 Burger Joint
//

    public Street getStreet(int index) {

        return (Street)this.streets.get(index);
    }


}
