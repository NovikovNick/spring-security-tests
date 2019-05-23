package com.metalheart;

import com.metalheart.config.RestApiConfiguration;
import com.metalheart.config.ServiceConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import( {
    RestApiConfiguration.class,
    ServiceConfiguration.class
})
public class AppConfiguration {
}
