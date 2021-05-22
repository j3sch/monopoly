package com.hdm.monopoly.backened.board.streets;

import java.util.ArrayList;

public class StreetManager {


//Eigenschaften
//properties

final private String[]  streetName = {"Go", "Burger Joint", "Pizza House", "Chance", "Candy Store","Ice Cream Palor", "Jail", "Museum", "Library", "Chance", "Skate Park", "Swimming Pool", "FreeParking", "Video Game Arcade", "Movie Theater", "Chance", "Toy Store", "Pet Store", "GoToJail", "Bowling Alley", "The Zoo", "Chance", "Park Place", "Boardwalk"};
private boolean[] sold = new boolean[15];
final private int[] price = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,5,5};
final private int[] rent = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,5,5};
final private String[]  color = {"Brown", "Brown", "Light Blue","Light Blue", "Pink", "Pink", "Orange","Orange","Red","Red", "Yellow", "Yellow","Green", "Green" , "Dark Blue", "Dark Blue"};
ArrayList<Street> streets = new ArrayList();
private int subtractor = 0;

//Constructor
    public StreetManager() {
        streetMaker();
    }

//Methods


//For schleife erstellt die Objekte und fügt sie der ArrayListe hinzu.
    public void streetMaker() {
        for(int i = 0; i < 23; i++) {
            if (i % 3 == 0) {
                Street street = new Street(this.streetName[i]);
                this.streets.add(street);
                subtractor++;
            } else {
                Street street = new Street(this.streetName[i], this.sold[i - subtractor], this.price[i - subtractor],
                        this.rent[i - subtractor], this.color[i - subtractor]);
                this.streets.add(street);
            }
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
