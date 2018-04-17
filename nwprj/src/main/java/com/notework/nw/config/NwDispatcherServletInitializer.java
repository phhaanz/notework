package com.notework.nw.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class NwDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	private Filter characterEncodingFilter()	{
		CharacterEncodingFilter ceFilter = new CharacterEncodingFilter();
		ceFilter.setEncoding("UTF-8");
		ceFilter.setForceEncoding(true);
		
		return ceFilter;
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { 	NwMybatisConfig.class, NwSecurityConfig.class }; 
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {
				NwServletConfig.class,
				NwMvcConfig.class,
				NwTilesConfig.class
		};
	}
	
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
	
	@Override
	protected Filter[] getServletFilters() {
		return new Filter[] { characterEncodingFilter() };
	}
	
}
