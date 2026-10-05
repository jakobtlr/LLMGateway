package at.tlr.llmgateway.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController("/key")
public class KeyController {

    /**
     * /key
     *
     *     POST -> /key
     *
     *     Body {api key, Provider}
     *
     *     GET -> /key
     *
     *     Query Params: provider
     *
     *     DELETE -> /key/{id}
     *
     *     PUT -> /key/{id}
     *
     *     BODY {api key, provider}
     */

}
