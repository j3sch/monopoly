package com.hdm.monopoly.backend.board.streets;

import com.hdm.monopoly.backend.player_money.Player;

public class GoToJail implements Field{

    private String name;

    public GoToJail(String name){
        this.name = name;
    }

    @Override
    public void moveOnField(Player player) {
        //TODO move to the Prison and look player there
    }

    @Override
    public String getFieldName() {
        return name;
    }
}
