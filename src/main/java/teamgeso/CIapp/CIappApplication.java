package teamgeso.CIapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Collections;

@SpringBootApplication(scanBasePackages="teamgeso.CIapp")
@ComponentScan("teamgeso.CIapp.repository")
public class CIappApplication {

    public static void main(String[] args) {
        SpringApplication.run(CIappApplication.class, args);
    }
   
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://157.230.12.110:8082")
                .allowedHeaders("Access-Control-Allow-Origin", "*")
                .allowedHeaders("Access-Control-Allow-Headers", "Content-Type,x-requested-with").maxAge(20000)
                .allowCredentials(false)
                .allowedMethods("DELETE");
            }
        };
    }
}