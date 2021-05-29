package com.hdm.monopoly.backend.board.streets;

import com.hdm.monopoly.backend.player_money.Player;

public class EventField implements Field{

    private String name;

    public EventField(String name){
        this.name = name;
    }

    @Override
    public void moveOnField(Player player) {
        //TODO
    }

    @Override
    public String getFieldName() {
        return name;
    }
}
