package com.ravi.config;

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
public class SecurityAppConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests( (req)-> 
				req.requestMatchers("/")
				.permitAll()
				.anyRequest()
				.authenticated());
		return http.build();
	}
	
	@Bean
	public InMemoryUserDetailsManager configureManager() {
		
		UserDetails u1 = User.withDefaultPasswordEncoder()
			.username("ravi")
			.password("ravi123")
			.roles("Admin")
			.build();
		
		
		UserDetails u2 = User.withDefaultPasswordEncoder()
			.username("sohan")
			.password("sohan123")
			.roles("User")
			.build();
		
		return new InMemoryUserDetailsManager(u1,u2);							
	}

}
