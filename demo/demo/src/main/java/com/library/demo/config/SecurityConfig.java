package com.library.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity//allows you to configure various aspects of web security for the application
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .httpBasic(basic -> basic.realmName("GraphQL API"))  // Enable HTTP Basic Authentication
            .authorizeHttpRequests(authz -> authz
                .requestMatchers("/graphql").hasRole("ADMIN")  // Secure GraphQL endpoint for admin only
                .requestMatchers("/h2-console/**").permitAll()  // Allow H2 console access (optional)
                .anyRequest().authenticated()  // Require authentication for all other requests
            )
            .csrf(csrf -> csrf
                .ignoringRequestMatchers("/graphql", "/h2-console/**")  // Disable CSRF for GraphQL and H2
            )
            .headers(headers -> headers
                .frameOptions(frame -> frame.sameOrigin())  // Allow H2 console frames
            );
        
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("admin")
            .password("{noop}password")  // Using {noop} for no password encoding (development only)
            .roles("ADMIN")
            .build());
        return manager;
    }
}

/*Explanation:
 Security Setup:
 - Basic authentication is used with the realm name "GraphQL API".
 - The /graphql endpoint is protected and only accessible by users with the "ADMIN" role.
 - The /h2-console/** endpoint (used for H2 database console) is accessible to everyone.
 - CSRF protection is disabled for the /graphql and /h2-console/** endpoints.

 User Management:
 - An in-memory user manager is used with a single hardcoded user (admin) having the role "ADMIN".
 - The password for the "admin" user is set to "password" (without encoding) for development purposes.
 - This setup is meant for testing and development; for production, password encoding and a persistent user store are recommended.
*/