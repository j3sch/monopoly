package com.hdm.monopoly.backend.board.streets;

import com.hdm.monopoly.backend.di.GameConfig;
import com.hdm.monopoly.backend.player_money.Player;

public class GoToJail implements Field{

    private String name;

    public GoToJail(String name){
        this.name = name;
    }

    @Override
    public void moveOnField(Player player) {
        //TODO move to the jail and look player there

        //TODO get the Game object and teleport player to jail

        player.getArrested();
    }

    @Override
    public String getFieldName() {
        return name;
    }
}
