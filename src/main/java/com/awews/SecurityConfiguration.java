package com.awews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.awews.person.User;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration {
	
	@Autowired
	private SpringDataJpaUserDetailsService userDetailsService;
	
//	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.userDetailsService(this.userDetailsService)
				.passwordEncoder(User.PASSWORD_ENCODER);
	}
	
//	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.anonymous()
				.antMatchers("/api/ver0001/**").permitAll()
				.and()
			.authorizeRequests()
				.antMatchers("/").permitAll()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.defaultSuccessUrl("/", true)
				.permitAll()
				.and()
			.httpBasic()
				.and()
			.csrf().disable()
			.logout()
				.logoutSuccessUrl("/");
	}

}
