package app.custom.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@ConfigurationProperties(prefix = "proj.services")
public class ProjectConfigRoot {
    private String message1;
    private String message2;
    private List<ServicesConfig> services = new ArrayList<>();
}