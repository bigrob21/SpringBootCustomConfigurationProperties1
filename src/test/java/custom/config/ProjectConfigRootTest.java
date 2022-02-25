package custom.config;

import app.custom.config.ProjectConfigRoot;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.TestPropertySources;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
@ExtendWith(SpringExtension.class)
@TestPropertySources({
        @TestPropertySource(properties = "classpath:/application.properties")
})
//@ConfigurationPropertiesScan(basePackages = {"app.custom.config"})
@Import({ProjectConfigRoot.class})
public class ProjectConfigRootTest {

    @Autowired
    private ProjectConfigRoot config;

    @Disabled("Need to figure out why I get a non-null, but non-initialized Config object!?")
    @Test
    public void test() {
        log.error("\n\n");
        log.error("{} {}",config.getMessage1(), config.getMessage2());
        log.error("\n\n");
        assertNotNull(config);
        assertTrue(config.getMessage1() != null);
    }

}
