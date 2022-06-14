package co.objectivity.dpokusa;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ShellMoonResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/status")
          .then()
             .statusCode(200);
    }

}