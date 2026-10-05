package at.tlr.llmgateway.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController("/alias")
public class AliasController {

    /**
     * /alias
     *
     *     POST -> /alias
     *
     *     Body {name, model}
     *
     *     GET -> /alias
     *
     *     QueryParams: name
     *
     *     PUT -> /alias/{id}
     *
     *     Body {name,model}
     *
     *     DELETE -> /alias/{id}
     */
}
