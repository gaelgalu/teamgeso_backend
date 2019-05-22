package teamgeso.CIapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
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
   
@Configuration
public class CorsConfig implements WebMvcConfigurer {

@Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**")
                .allowedOrigins("http://157.230.12.110","http://157.230.12.110:8080")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD")
                .allowCredentials(true)
        ;
    }

}



}

