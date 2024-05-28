package org.algalopez.bookplace.bookstore;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class BookstoreControllerApiTest {

  @Test
  void ping() {
    given().when().get("/bookstore/ping").then().statusCode(200).body(is("pong"));
  }
}
