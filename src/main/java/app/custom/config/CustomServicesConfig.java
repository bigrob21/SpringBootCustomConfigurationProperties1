package app.custom.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties
public class CustomServicesConfig {
    private String serviceName;
    private String altName;
//    private List<String> attributes = new ArrayList<>();
}
