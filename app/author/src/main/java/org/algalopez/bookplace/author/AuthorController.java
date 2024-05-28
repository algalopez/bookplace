package org.algalopez.bookplace.author;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.algalopez.bookplace.shared.EchoService;

@RequiredArgsConstructor
@Slf4j
@Path("/author")
@Produces(MediaType.TEXT_PLAIN)
public class AuthorController {

    private final EchoService echoService;

    @GET
    @Path("/ping")
    public String ping() {
        log.info("pong");
        return echoService.ping();
    }
}
