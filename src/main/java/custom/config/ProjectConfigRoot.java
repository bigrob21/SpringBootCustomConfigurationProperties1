package custom.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

//@Configuration
@Data
@ConfigurationProperties(prefix = "proj.services")
public class ProjectConfigRoot {
    private String message1;
    private String message2;
    private List<ServicesConfig> services = new ArrayList<>();
}