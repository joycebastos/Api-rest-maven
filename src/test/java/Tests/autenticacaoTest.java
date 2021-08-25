package Tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class autenticacaoTest {

    Setenviroment env = new Setenviroment();

    @Test
    @DisplayName("Autenticaçao")
    public void autenticacao() {

        given()
                .header("content-type", "application/json")
                .body("{\n" +
                        "  \"usuarioEmail\": \"antonio@yopmail.com\",\n" +
                        "  \"usuarioSenha\": \"123456789\"\n" +
                        "}")
                .log().all()

                .when()
                .post(env.setAutenticacao())

                .then()
                .log().all()
                .statusCode(200);
    }
}
