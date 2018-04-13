package com.notework.nw;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;

@Configuration
public class NwTilesConfig {
	
	@Bean
	public TilesConfigurer tilesConfig()
	{
		TilesConfigurer tilesConfig = new TilesConfigurer();
		tilesConfig.setDefinitions("/WEB-INF/tiles.xml");
		
		return tilesConfig;
	}
	
}
