package com.example.demo.datasource;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "sqlServerEntityManagerFactory", transactionManagerRef = "sqlServerTransactionManager", basePackages = {
		"com.example.demo.datasource.sqlserver.repo" })
public class SQLServerDBConfig {

	@Bean(name = "sqlServerDataSource")
	@ConfigurationProperties(prefix = "sqlserver.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "sqlServerEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean sqlServerEntityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("sqlServerDataSource") DataSource dataSource) {
		return builder.dataSource(dataSource).packages("com.example.demo.datasource.sqlserver.domain").persistenceUnit("SQLServer").build();
	}

	@Bean(name = "sqlServerTransactionManager")
	public PlatformTransactionManager sqlServerTransactionManager(
			@Qualifier("sqlServerEntityManagerFactory") EntityManagerFactory sqlServerEntityManagerFactory) {
		return new JpaTransactionManager(sqlServerEntityManagerFactory);
	}
}
