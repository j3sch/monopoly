package com.hdm.monopoly.backened.websocket;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.messaging.handler.annotation.*;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ResponsePlayerList {

	ArrayList<Map<String, String>> map = new ArrayList<>();
	private int playerNumber;
	private final String[] PLAYERS_COLORS = {"#f44336", "#2196f3", "#4caf50", "#FFEB3B"};
	Boolean isPartyFull = false;

	/*
	get the entered name of the player and then add it to the player list
	 */
	@MessageMapping("/playerName")
	@SendTo("/client/playerList")
	public String playerList(PlayerName message) throws Exception {
		if (playerNumber < 4) {
			map.add(playerNumber, new HashMap<>());
			map.get(playerNumber).put("name", message.getName());
			map.get(playerNumber).put("position", "0");
			map.get(playerNumber).put("credit", "31$");
			map.get(playerNumber).put("color", PLAYERS_COLORS[playerNumber]);

			playerNumber++;
			if (playerNumber == 4) {
				isPartyFull = true;
			}
		}
		return new ObjectMapper().writeValueAsString(map);
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



















//	@SendTo("user/client/playerList")
//	public String playerList(PlayerName message, @Header("simpSessionId") String sessionId) throws Exception {
//
////	@SendTo("/client/partyFull")
////	public String partyFull() throws Exception {
////		return new ObjectMapper().writeValueAsString("Sry, Party is full!");
////	}
//	}
