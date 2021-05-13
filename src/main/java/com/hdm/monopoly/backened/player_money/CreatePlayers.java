package com.hdm.monopoly.backened.player_money;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;

@Controller
public class CreatePlayers {
    private int playerNumber;
    private final Spieler[] players = new Spieler[4];
    private final Colours colours = new Colours();
    private Boolean isPartyFull = false;

    /*
    gets the entered player name.
    Creates the player and sends the array of all players to the client.
    */
    @MessageMapping("/playerName")
    @SendTo("/client/playerList")
    public String addPlayer(Spieler message) throws JsonProcessingException {
        if (playerNumber < 4) {
            players[playerNumber] = new Spieler(
                    playerNumber,
                    message.getName(),
                    colours.getColours(playerNumber)
            );
            playerNumber++;

            if (playerNumber == 4) {
                isPartyFull = true;
            }
        }
        return new ObjectMapper().writeValueAsString(players);
    }

    public Spieler[] getPlayers() {
        return players;
    }

    //Define previous Player for everyone
    public void setPreviousPlayers() {
        for(int i = 0; i < playerNumber; i++){
            if(i!=0) {
                players[i].setPreviousPlayer(players[i-1]);
            }else{
                players[i].setPreviousPlayer(players[playerNumber -1]);
            }
        }
    }

    /*
    gets a message on successful connection and then tells the client if more players can join
    */
    @MessageMapping("/message")
    @SendToUser("/client/reply")
    public String processMessageFromClient() throws Exception {
        Thread.sleep(1000);

        return new ObjectMapper().writeValueAsString(isPartyFull);
    }
}
