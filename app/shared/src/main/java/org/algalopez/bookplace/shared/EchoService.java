package org.algalopez.bookplace.shared;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ApplicationScoped
public class EchoService {

    public String ping() {
        log.info("pong");
        return "pong";
    }
}
