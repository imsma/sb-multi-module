package im.sma.application.service;

// import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import im.sma.library.service.SampleService;

@SpringBootTest("service.message=Hello from Test")
public class SampleServiceTest {
    @Autowired
    private SampleService sampleService;

    @Test
    public void contextLoads() {
        assertThat(sampleService.message()).isNotNull();
    }

    @SpringBootApplication(scanBasePackages = "im.sma")
    static class TestConfiguration {
    }

}
