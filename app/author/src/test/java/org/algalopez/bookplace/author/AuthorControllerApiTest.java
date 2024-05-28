package org.algalopez.bookplace.author;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
class AuthorControllerApiTest {

  @Test
  void ping() {
    given().when().get("/author/ping").then().statusCode(200).body(is("pong"));
  }
}
