package com.notework.nw;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan(basePackages="com.notework.nw.controller")
public class NwServletConfig {
	@Bean
	public InternalResourceViewResolver irViewResolver() {
		InternalResourceViewResolver irViewResolver = new InternalResourceViewResolver();
		irViewResolver.setViewClass(JstlView.class);
		irViewResolver.setPrefix("/WEB-INF/views/");
		irViewResolver.setSuffix(".jsp");
		irViewResolver.setOrder(2);
		
		return irViewResolver;
	}
	
	@Bean
	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
		multipartResolver.setMaxUploadSize(314572800);
		
		return multipartResolver;
	}
}
