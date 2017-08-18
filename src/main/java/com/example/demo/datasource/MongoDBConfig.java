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
@EnableJpaRepositories(entityManagerFactoryRef = "mongoDBEntityManagerFactory", transactionManagerRef = "mongoDBTransactionManager", basePackages = {
		"com.example.demo.datasource.mongodb.repo" })
public class MongoDBConfig {

	@Bean(name = "mongoDBDataSource")
	@ConfigurationProperties(prefix = "mongodb.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "mongoDBEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean mongoDBEntityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("mongoDBDataSource") DataSource dataSource) {
		return builder.dataSource(dataSource).packages("com.example.demo.datasource.mongodb.domain").persistenceUnit("MongoDB").build();
	}

	@Bean(name = "mongoDBTransactionManager")
	public PlatformTransactionManager mongoDBTransactionManager(
			@Qualifier("mongoDBEntityManagerFactory") EntityManagerFactory mongoDBEntityManagerFactory) {
		return new JpaTransactionManager(mongoDBEntityManagerFactory);
	}
}
