package com.rollingstone.springboot.oauth2.jwt.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * Created by bdatta on 10/08/17.
 */
@Configuration
public class SpringBootOAuth2WebConfig {
    
	/**
     * In a Real Production Application, methods, headers and origins would need specific entries.
     *
     */
    @Bean
    public FilterRegistrationBean corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration oAuth2CorsConfig = new CorsConfiguration();
        oAuth2CorsConfig.setAllowCredentials(true);
        oAuth2CorsConfig.addAllowedOrigin("*");
        oAuth2CorsConfig.addAllowedHeader("*");
        oAuth2CorsConfig.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", oAuth2CorsConfig);
        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
        bean.setOrder(0);
        return bean;
    }
}
