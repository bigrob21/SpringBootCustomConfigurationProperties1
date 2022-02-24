package app.custom.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "proj.services")
public class ProjectConfigRoot {
    private String message1;
    private String message2;
    private List<CustomServicesConfig> attributes = new ArrayList<>();
}