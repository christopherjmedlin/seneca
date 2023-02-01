package xyz.christophermedlin.seneca.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf()
            .and()
            .authorizeHttpRequests(authz -> authz.requestMatchers("/")
                .permitAll()
                .anyRequest()
                .authenticated())
            .oauth2Login()
            .and()
            .logout()
            .logoutSuccessUrl("/");
        return http.build();
    }
}
