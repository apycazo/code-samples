package demo.spring.maven;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.URI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.util.UriComponentsBuilder;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AppTest {

    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    public void request_echo_returnsExpected () 
    {
        URI uri = UriComponentsBuilder.fromUriString("/test").build().toUri();

        ResponseEntity<String> response = testRestTemplate.getForEntity(uri, String.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo("Echo!test");
    }

}
