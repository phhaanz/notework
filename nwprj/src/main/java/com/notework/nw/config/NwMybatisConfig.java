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
		dataSource.setUrl("jdbc:mysql://vaio.notepubs.com/notepubsdb?serverTimezone=UTC&amp;autoReconnect=true&amp;useSSL=false&amp;useUnicode=true&amp;characterEncoding=utf8");
		dataSource.setUsername("notepubs");
		dataSource.setPassword("cclass");
		dataSource.setInitialSize(20);
		dataSource.setMaxActive(30);

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
