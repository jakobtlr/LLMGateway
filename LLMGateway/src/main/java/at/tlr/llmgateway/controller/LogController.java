package at.tlr.llmgateway.controller;


import org.springframework.web.bind.annotation.RestController;

@RestController("/log")
public class LogController {

    /**
     * /log
     *
     *     GET -> /log
     *
     *     Query Params: from, to, status, model, provider
     *
     *     GET -> /log/{requestId}
     */
}
