package com.hdm.monopoly.backend.board.streets;

public class FieldFactory {

    static Field createStreet(String name, int price, int rent, Color color){
        return new Street(name,price,rent,color);
    }

    static Field createGo(int goValue){
        return new Go(goValue);
    }

}
