package com.hdm.monopoly.backened.websocket;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ResponsePlayerList {

	ArrayList<Map<String, String>> map = new ArrayList<>();
	private int playerNumber;
	private final String[] COLORS = {"#f44336", "#2196f3", "#4caf50", "#FFEB3B"};

	@MessageMapping("/playerName")
	@SendTo("/client/playerData")
	public String greeting(PlayerName message) throws Exception {

		if (playerNumber < 4 ) {
			map.add(playerNumber, new HashMap<>());
			map.get(playerNumber).put("name", message.getName());
			map.get(playerNumber).put("position", "0");
			map.get(playerNumber).put("credit", "31$");
			map.get(playerNumber).put("color", COLORS[playerNumber]);

			playerNumber++;

			return new ObjectMapper().writeValueAsString(map);
		}
		return new ObjectMapper().writeValueAsString("Sry, Party is full");
	}
}