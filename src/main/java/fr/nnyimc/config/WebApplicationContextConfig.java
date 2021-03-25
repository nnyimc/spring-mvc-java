package fr.nnyimc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import fr.nnyimc.formatter.CountryFormatter;
import fr.nnyimc.formatter.PhoneFormatter;

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
    
    public void addFormatters(FormatterRegistry registry) {
    	registry.addFormatter(new PhoneFormatter());
    	registry.addFormatter(new CountryFormatter());
    }


}
