package chen.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan({"chen.controller"})
@Configuration
@EnableWebMvc
public class SpringMvcConfig {
}
