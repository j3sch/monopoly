package com.hdm.monopoly.backened.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.socket.messaging.SessionConnectedEvent;

import java.util.logging.Logger;

//@Component
//public class StompConnectedEvent implements ApplicationListener<SessionConnectedEvent> {
//
//
//    @Autowired
//    private Controller controller;
//
//    @Override
//    public void onApplicationEvent(SessionConnectedEvent event) {
//        constroller.sendMessage()
//        // you can use a controller to send your msg here
//    }
//}