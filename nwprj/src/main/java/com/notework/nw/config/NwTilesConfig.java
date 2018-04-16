package com.notework.nw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
public class NwTilesConfig {
	
	@Bean
	public TilesConfigurer tilesConfig()
	{
		TilesConfigurer tilesConfig = new TilesConfigurer();
		tilesConfig.setDefinitions(new String[] { "/WEB-INF/tiles.xml" });
		tilesConfig.setCheckRefresh(true);
		
		return tilesConfig;
	}
	
	@Bean
	public UrlBasedViewResolver urlViewResolver() {
		UrlBasedViewResolver urlViewResolver = new UrlBasedViewResolver();
		urlViewResolver.setViewClass(TilesView.class);
		urlViewResolver.setOrder(1);
		
		return urlViewResolver;
	}
	
}
