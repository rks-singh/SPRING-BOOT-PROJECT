package com.ravi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityAppConfig {

	public InMemoryUserDetailsManager configureUser() {
		
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
