package com.notework.nw;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScans(value={
		@ComponentScan("com.notework.nw.service"),
		@ComponentScan("com.notework.nw.service.member"),
		@ComponentScan("com.notework.nw.dao.mybatis")
})
@MapperScan()
public class NwMybatisConfig {
	
	@Bean(destroyMethod="close")
	public BasicDataSource dataSouce() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://211.238.142.97/newlecture?autoReconnect=true&amp;useSSL=false&amp;useUnicode=true&amp;characterEncoding=utf8");
		dataSource.setUsername("sist");
		dataSource.setPassword("cclass");
		dataSource.setInitialSize(20);
		dataSource.setMaxActive(30);

		return dataSource;
	}
	
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSouce());
		/*sqlSessionFactory.setMapperLocations("classpath:com/notework/nw/dao/mybatis/mapper/*.xml");*/
		
		return sqlSessionFactory;
	}
	
	public SqlSessionTemplate sqlSession(SqlSessionFactoryBean sqlSessionFactory) throws Exception
	{
		SqlSessionTemplate sqlSession = new SqlSessionTemplate(sqlSessionFactory.getObject());
		
		return sqlSession;
	}
/*	
	public DataSourceTransactionManager transactionManager()
	{
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.set
	}*/
	

}
