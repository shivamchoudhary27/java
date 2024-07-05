package com.aiims.antenatalcare.portal.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.aiims.antenatalcare.portal.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	@Autowired
	private JwtAuthenticationFilter jwtAuthenticationFilter;

	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		System.out.println(passwordEncoder().encode("BLAdmin@345"));
		http.csrf(AbstractHttpConfigurer::disable);
		AuthenticationManagerBuilder authenticationManagerBuilder = http
				.getSharedObject(AuthenticationManagerBuilder.class);
		authenticationManagerBuilder.userDetailsService(customUserDetailsService);
		AuthenticationManager authenticationManager = authenticationManagerBuilder.build();
		http.authenticationManager(authenticationManager);
		http.cors();

		http.authorizeHttpRequests(authorize -> authorize
				.requestMatchers("/img/**", "/js/**", "/css/**", "/webfonts/**", "/api/v2/auth/signin").permitAll()
				.anyRequest().authenticated()).authenticationProvider(authenticationProvider())
				.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
				.formLogin(formLogin -> formLogin.loginPage("/login").loginProcessingUrl("/login")
						.failureUrl("/login?failure=true").defaultSuccessUrl("/dashboard").permitAll())
				.logout((logout) -> logout.logoutSuccessUrl("/login").permitAll());

		return http.build();
	}

	@Bean
	BCryptPasswordEncoder passwordEncoder() {

		return new BCryptPasswordEncoder();
	}

	@Bean
	AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(customUserDetailsService);
		authProvider.setPasswordEncoder(passwordEncoder());
		return authProvider;
	}

	@Bean
	AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
		return config.getAuthenticationManager();
	}
}
