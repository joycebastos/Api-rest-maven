package Tests;
import org.junit.jupiter.api.*;
import static io.restassured.RestAssured.given;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class addUsuarioTest {

    Setenviroment env = new Setenviroment();

    @Test
    @DisplayName("Adicionar novo usuário")
    public void adicionarNovoUsuario() {

        given()
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "  \"usuarioNomeCompleto\": \"Antonio Jose\",\n" +
                        "  \"usuarioEmail\": \"antonio@yopmail.com\",\n" +
                        "  \"usuarioSenha\": \"123456789\",\n" +
                        "  \"usuarioTelefone\": \"051988887733\"\n" +
                        "}")
                .log().all()

                .when()
                .post(env.setEnviromentAdicionaNovoUsuario())

                .then()
                .log().all()
                .statusCode(201);
    }

}
