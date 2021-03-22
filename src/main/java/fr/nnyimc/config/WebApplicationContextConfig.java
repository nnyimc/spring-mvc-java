package fr.nnyimc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("fr.nnyimc")
public class WebApplicationContextConfig implements WebMvcConfigurer {
    public static final String PREFIX = "/WEB-INF/jsp/";
    public static final String SUFFIX = ".jsp";

    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix(PREFIX);
        viewResolver.setSuffix(SUFFIX);
        return viewResolver;
    }


}
