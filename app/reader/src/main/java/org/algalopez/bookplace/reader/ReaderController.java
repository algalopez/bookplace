package org.algalopez.bookplace.reader;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Path("/reader")
@Produces(MediaType.TEXT_PLAIN)
public class ReaderController {

    @GET
    @Path("/ping")
    public String ping() {
        log.info("pong");
        return "pong";
    }
}
