package at.tlr.llmgateway.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController("/chat")
public class ChatController {

    /**
     * /chat
     *
     *     POST -> /chat
     *
     *     Body { prompt, provider, model(kann auch alias sein) }
     */
}
