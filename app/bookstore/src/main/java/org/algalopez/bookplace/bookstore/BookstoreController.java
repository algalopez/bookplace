package org.algalopez.bookplace.bookstore;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Path("/bookstore")
@Produces(MediaType.TEXT_PLAIN)
public class BookstoreController {

    @GET
    @Path("/ping")
    public String ping() {
        log.info("pong");
        return "pong";
    }
}
