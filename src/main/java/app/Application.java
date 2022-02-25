package app;

import custom.config.ProjectConfigRoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Import(ProjectConfigRoot.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RestController
    class PropertiesController {

        private final ProjectConfigRoot configRoot;

        @Autowired
        PropertiesController(ProjectConfigRoot root) {
            this.configRoot = root;
        }

        @GetMapping("/")
        public ResponseEntity<ProjectConfigRoot> getConfig() {
            return ResponseEntity.ok(configRoot);
        }
    }

}
