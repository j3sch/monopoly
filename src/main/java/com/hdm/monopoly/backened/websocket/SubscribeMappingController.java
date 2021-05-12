package com.hdm.monopoly.backened.websocket;

import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;

@Controller
public class SubscribeMappingController {

@SubscribeMapping("user/client/isPartyFull")
public String sendOneTimeMessage() {
    return "server one-time message via the application";

}
}