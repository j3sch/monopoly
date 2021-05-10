package org.monopoly;

public class CreatePlayers {
    private int numberOfPlayers;
    private Player[] players;
    private Colours colours = new Colours();

    //create all Players

    public CreatePlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        for(int i = 0; i < numberOfPlayers; i++) {

            players[i] = new Player(i, ("Spieler" + i+1), colours.getColours(i));
        }
    }

    public Player[] getPlayers() {
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
