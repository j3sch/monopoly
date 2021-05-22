package com.hdm.monopoly.backened.di;

import com.hdm.monopoly.backened.board.streets.StreetManager;
import com.hdm.monopoly.backened.player_money.Player;
import com.hdm.monopoly.backened.player_money.SendMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.hdm.monopoly.backened")
public class GameConfig {

    private final Player[] players = new Player[4];
    private final StreetManager streetManager = new StreetManager();
    private final String[] sessionIds = new String[4];
    private final SendMessage sendMessage = new SendMessage();

    @Bean
    public Player[] getPlayers() {
        return players;
    }

    @Bean
    public StreetManager getStreetManager() {
        return streetManager;
    }

    @Bean
    public String[] getSessionIds() {
        return sessionIds;
    }
}
