package com.ravi.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

	@Bean
	SecurityFilterChain securityConfig(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(
                (request) -> request
                        .requestMatchers("/message").permitAll()
                        .requestMatchers("/").permitAll()
                        .requestMatchers("/greet").authenticated()
                        .anyRequest().authenticated()
        ).formLogin(withDefaults());
		
		return http.build();
	}
	
	@Bean
	InMemoryUserDetailsManager userConfig() {
		
		UserDetails adminUser = User.withDefaultPasswordEncoder()
			.username("ravi")
			.password("ravi123")
			.authorities("Admin")
			.build();
		
		UserDetails normalUser = User.withDefaultPasswordEncoder()
			.username("sohan")
			.password("sohan123")
			.authorities("User")
			.build();
		
		return new InMemoryUserDetailsManager(adminUser, normalUser);
	}
}
