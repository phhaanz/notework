package com.notework.nw.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan(basePackages="com.notework.nw.dao.mybatis.mapper")
@ComponentScans(value={
		@ComponentScan("com.notework.nw.service"),
		@ComponentScan("com.notework.nw.dao.mybatis")
})
public class NwMybatisConfig {
	
	@Bean(destroyMethod="close")
	public BasicDataSource dataSouce() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://211.238.142.76:3306/noteworkdb?serverTimezone=UTC&;autoReconnect=true&useSSL=false&useUnicode=true&characterEncoding=utf8");
		dataSource.setUsername("developer");
		dataSource.setPassword("developer");

		return dataSource;
	}
	
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSouce());
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sqlSessionFactory.setMapperLocations(resolver.getResources("classpath:com/notework/nw/dao/mybatis/mapper/*.xml"));
		
		return sqlSessionFactory;
	}
	
	@Bean(destroyMethod="clearCache")
	public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) throws Exception {
		SqlSessionTemplate sqlSession = new SqlSessionTemplate(sqlSessionFactory);
		
		return sqlSession;
	}
	
	@Bean
	public DataSourceTransactionManager transactionManager() {
		
		return new DataSourceTransactionManager(dataSouce());
	}
	
}
