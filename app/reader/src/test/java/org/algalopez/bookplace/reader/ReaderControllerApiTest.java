package org.algalopez.bookplace.reader;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
class ReaderControllerApiTest {

  @Test
  void ping() {
    given().when().get("/reader/ping").then().statusCode(200).body(is("pong"));
  }
}
