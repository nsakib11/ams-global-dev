package com.ams.api.config;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;

import jakarta.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

//@Configuration
//@EnableJpaRepositories(basePackages = {"com.oracle.fcr.ngi.repository", "com.oracle.fcr.ngi.user.repository", "com.oracle.fcr.ngi.il.repository"}, entityManagerFactoryRef = "entityManager", transactionManagerRef = "transactionManager")
public class JpaConfig {
	/*private static final Logger logger = LoggerFactory.getLogger(JpaConfig.class);
	@Value("${spring.jpa.timeout-sec}")
	private int timeout;

	@Autowired
	private Environment env;

	public HashMap<String, Object> jpaProperties() {
		HashMap<String, Object> properties = new HashMap<>();
		properties.put("hibernate.dialect", env.getProperty("spring.jpa.database-platform"));
		properties.put("hibernate.default_schema", env.getProperty("spring.main-datasource.schema"));
		return properties;
	}

	@Bean
	@Primary
    @ConfigurationProperties("spring.main-datasource")
	public DataSourceProperties dataSourceProperties() {
		return new DataSourceProperties();
	}

	@Bean
	@Primary
    @ConfigurationProperties(prefix = "spring.main-datasource.tomcat")
	public DataSource dataSource(DataSourceProperties dataSourceProperties) {
		org.apache.tomcat.jdbc.pool.DataSource dataSource = dataSourceProperties.initializeDataSourceBuilder().type(org.apache.tomcat.jdbc.pool.DataSource.class)
				.build();
		try (Connection connection = dataSource.getConnection()) {
			logger.info("Main database Connected");
		} catch (SQLException e) {
			logger.error("Failed to  connected main database, message: {}", e.getMessage());
		}
		return dataSource;
	}

	@Bean
	@Primary
	public LocalContainerEntityManagerFactoryBean entityManager(EntityManagerFactoryBuilder builder,
			DataSource dataSource) {
		return builder.dataSource(dataSource).packages("com.oracle.fcr.ngi.entity", "com.oracle.fcr.ngi.user.entity", "com.oracle.fcr.ngi.il.entity").properties(jpaProperties()).build();
	}

	@Primary
	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setDefaultTimeout(timeout);
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}

	@Bean(name = "primaryJdbcTemplate")
	public JdbcTemplate jdbcTemplate(DataSource dataSource) throws SQLException {
		dataSource.getConnection().setAutoCommit(false);
		return new JdbcTemplate(dataSource);
	}
	@Bean(name = "mainJdbcTemplate")
    public JdbcTemplate mainJdbcTemplate(DataSource dataSource) throws SQLException {
    	dataSource.getConnection().setAutoCommit(false);
        return new JdbcTemplate(dataSource);
    }
	@Bean(name = "namedParamMainJdbcTemplate")
    public NamedParameterJdbcTemplate namedParamMainJdbcTemplate(DataSource dataSource) throws SQLException {
    	dataSource.getConnection().setAutoCommit(false);
        return new NamedParameterJdbcTemplate(dataSource);
    }*/

	/*@Bean(name = "userEntityManager")
	public LocalContainerEntityManagerFactoryBean userEntityManager(EntityManagerFactoryBuilder builder,
																	DataSource dataSource) {
		return builder.dataSource(dataSource).packages("com.oracle.fcr.ngi.user.entity").properties(jpaProperties())
				.build();
	}
	@Bean(name = "userTransactionManager")
	public PlatformTransactionManager userTransactionManager(
			@Qualifier("userEntityManager") EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setDefaultTimeout(timeout);
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}*/
}
