package uz.wsm;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.Import;
import org.springframework.restdocs.RestDocumentationContextProvider;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;
import static org.springframework.restdocs.restassured.RestAssuredRestDocumentation.documentationConfiguration;

@ExtendWith({RestDocumentationExtension.class, SpringExtension.class})
@Import({TestContainerConfiguration.class})
@SpringBootTest(classes = WsmApplicationTests.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class WsmApplicationTests {

    @LocalServerPort
    private Integer port;
    private RequestSpecification requestSpecification;


    @BeforeEach
    void setUp(RestDocumentationContextProvider restDocumentation) {
        this.requestSpecification = new RequestSpecBuilder()
                .addFilter(documentationConfiguration(restDocumentation)
                        .operationPreprocessors()
                        .withRequestDefaults(prettyPrint())
                        .withResponseDefaults(prettyPrint()))
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .setBasePath("/wsm-service")
                .setPort(port)
                .setContentType(ContentType.JSON)
                .build();
    }

    @Test
    void contextLoads() {
    }

}
