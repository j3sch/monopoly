package com.hdm.monopoly.backened.player_money;



public class CreatePlayers {
    private int numberOfPlayers;
    private Spieler[] players;
    private Colours colours = new Colours();

    //create all Players

    public CreatePlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        for(int i = 0; i < numberOfPlayers; i++) {

            players[i] = new Spieler(i, ("Spieler" + i+1), colours.getColours(i));
        }
    }

    public Spieler[] getPlayers() {
        return players;
    }

    //Define previous Player for everyone

    public void setPreviousPlayers() {
        for(int i = 0; i < numberOfPlayers; i++){
            if(i!=0) {
                players[i].setPreviousPlayer(players[i-1]);
            }else{
                players[i].setPreviousPlayer(players[numberOfPlayers -1]);
            }
        }
    }
}
