package com.ravi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration {
	
	@Autowired
	private UserDetailsService uds;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	
	@Bean
	SecurityFilterChain securityConfig(HttpSecurity http) throws Exception{

        http.authorizeHttpRequests(requests -> requests
                .requestMatchers("/home", "/register", "/saveUser").permitAll()
                .requestMatchers("/welcome").authenticated()
                .requestMatchers("/admin").hasAuthority("Admin")
                .requestMatchers("/mgr").hasAuthority("Manager")
                .requestMatchers("/emp").hasAuthority("Employee")
                .requestMatchers("/hr").hasAuthority("HR")
                .requestMatchers("/common").hasAnyAuthority("Employee", "Manager", "Admin")
                .anyRequest().authenticated())
                .formLogin(login -> login
                        .defaultSuccessUrl("/welcome", true))
                .logout(logout -> {
					try {
						logout
						.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))

						.and()
						.exceptionHandling(handling -> handling
						        .accessDeniedPage("/accessDenied"))
						.authenticationProvider(authenticationProvider());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
		return http.build();
	}

	@Bean
	AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
		authenticationProvider.setUserDetailsService(uds);
		authenticationProvider.setPasswordEncoder(encoder);
		return authenticationProvider;
	}

}
