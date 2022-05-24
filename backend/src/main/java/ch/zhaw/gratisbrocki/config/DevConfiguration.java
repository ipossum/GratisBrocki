package ch.zhaw.gratisbrocki.config;

import ch.zhaw.gratisbrocki.utils.HasLogger;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Defines a Bean for the dev-Profile
 */
@Configuration
@Profile("dev")
// @ConditionalOnClass(name = {"org.h2.Driver"})
public class DevConfiguration implements HasLogger {
    public DevConfiguration() {
        getLogger().info("Dev Configuration Class");
    }
}
