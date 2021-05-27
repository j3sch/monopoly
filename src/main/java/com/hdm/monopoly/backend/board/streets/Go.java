package com.hdm.monopoly.backend.board.streets;

import com.hdm.monopoly.backend.player_money.Player;

public class Go implements Field {

    private int goValue;

    public Go(int goValue){
        this.goValue = goValue;
    }

    @Override
    public void moveOnField(Player player) {
        player.PlayerGetsMoney(goValue);
    }
}
