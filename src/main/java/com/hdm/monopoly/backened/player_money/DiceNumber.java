package com.hdm.monopoly.backened.player_money;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;

@Controller
public class DiceNumber {

    /*
    get message, if player clicked on button
    and deactivate the button.
     */
    @MessageMapping("/diceNumberBtnClicked")
    @SendToUser("/client/toggleDiceNumberBtn")
    public String addPlayer() throws JsonProcessingException {
        diceRandomNumber();
        return new ObjectMapper().writeValueAsString(true);
    }

    private void diceRandomNumber() {}
}
