package org.algalopez.bookplace.shared;

import static org.assertj.core.api.Assertions.assertThat;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@QuarkusTest
class EchoServiceTest {

  @Inject EchoService echoService;

  @Test
  void ping() {
    String echo = echoService.ping();

    assertThat(echo).isEqualTo("pong");
  }
}
