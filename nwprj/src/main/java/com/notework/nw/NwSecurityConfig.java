package com.notework.nw;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@ComponentScan(basePackages="com.notework.nw.config")
public class NwSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;
	
	@Bean
	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
		http.
			csrf().disable()
				.authorizeRequests()
					.antMatchers("/**", "/resources/**").permitAll()
					.antMatchers("/user/**").anonymous()
					.antMatchers("/member/**").hasRole("AUTHOR")
					.anyRequest().authenticated()
					.and()
				.formLogin()
					.loginPage("/user/login")
					.loginProcessingUrl("/user/login").
					defaultSuccessUrl("/member/index")
					.and()
				.logout()
					.logoutUrl("/user/logout")
					.logoutSuccessUrl("/index")
					.invalidateHttpSession(true);
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
		UserBuilder users = User.builder();
		
		auth.jdbcAuthentication()
			.dataSource(dataSource)
			.usersByUsernameQuery("select id, pwd password, 1 enabled from Member where id=?")
			.authoritiesByUsernameQuery("select memberId id, roleId authority from MemberRole where memberId=?")
			.passwordEncoder(new BCryptPasswordEncoder());
	}
}