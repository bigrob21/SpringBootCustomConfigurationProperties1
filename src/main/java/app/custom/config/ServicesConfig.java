package app.custom.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServicesConfig {
    private String serviceName;
    private String altName;
    private List<String> attributes = new ArrayList<>();
}
