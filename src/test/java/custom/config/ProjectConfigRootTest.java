package custom.config;

import app.custom.config.ProjectConfigRoot;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.TestPropertySources;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
@ExtendWith(SpringExtension.class)
@TestPropertySources({
        @TestPropertySource(properties = "classpath:application.yml"),
        @TestPropertySource(properties = "classpath:resource-mapping.yaml")
})
@Import({ProjectConfigRoot.class})
public class ProjectConfigRootTest {

    @Autowired
    private ProjectConfigRoot config;

    @Disabled
    @Test
    public void test() {
        log.error("\n\n");
        log.error("{} {}",config.getMessage1(), config.getMessage2());
        log.error("\n\n");
        assertTrue(config.getMessage1() != null);
    }

}
