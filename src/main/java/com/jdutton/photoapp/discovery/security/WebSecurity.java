package com.jdutton.photoapp.discovery.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// @formatter:off
		http.csrf()
		.disable()
		.authorizeRequests()
		.anyRequest()
		.authenticated()
		.and()
		.httpBasic();
		// @formatter:on

	}

}
