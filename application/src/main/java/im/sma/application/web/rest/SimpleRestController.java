package im.sma.application.web.rest;

import org.springframework.web.bind.annotation.RestController;

import im.sma.library.service.SampleService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class SimpleRestController {

    private SampleService sampleService;

    public SimpleRestController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/hello")
    public String sauHello() {
        return sampleService.message();
    }

}
