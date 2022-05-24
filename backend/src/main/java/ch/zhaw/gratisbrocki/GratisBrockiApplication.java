package ch.zhaw.gratisbrocki;

import ch.zhaw.gratisbrocki.utils.HasLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class GratisBrockiApplication implements HasLogger {

    @Autowired
    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(GratisBrockiApplication.class, args);
    }

    @PostConstruct
    public void afterInit() {
        boolean hasDevProfile = Arrays.asList(env.getActiveProfiles()).contains("dev");
        getLogger().info("Active Profiles: " + Arrays.toString(env.getActiveProfiles()) + "\n\n");
    }
}
