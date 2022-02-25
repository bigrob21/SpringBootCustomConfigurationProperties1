package app;

import custom.config.ProjectConfigRoot;
import custom.config.ServicesConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.TestPropertySources;

import static java.util.stream.Collectors.joining;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
@EnableConfigurationProperties
@SpringBootTest(classes = {ProjectConfigRoot.class})
@TestPropertySources({
        @TestPropertySource(properties = "logging.level.app")
})
public class ProjectConfigRootTest {

    @Autowired
    private Environment env;

    @Autowired
    private ProjectConfigRoot config;

    @Test
    public void test() {
        assertNotNull(env.getRequiredProperty("proj.services.message1"));
        log.error("\n\n");
        log.error("{} {}",config.getMessage1(), config.getMessage2());
        log.error("Services provided are [{}]", config.getServices().stream().map(ServicesConfig::getServiceName).collect(joining(",")));
        log.error("\n\n");
        assertNotNull(config);
        assertTrue(config.getServices().size() > 0);

    }

}
