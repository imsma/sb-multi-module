package im.sma.library.service;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import im.sma.library.config.ServiceProperties;

@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class SampleService {

    private final ServiceProperties serviceProperties;

    public SampleService(ServiceProperties serviceProperties) {
        this.serviceProperties = serviceProperties;
    }

    public String message() {
        return this.serviceProperties.getMessage();
    }

}
