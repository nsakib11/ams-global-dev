package com.ams.api.config;

import java.sql.Connection;
import java.sql.SQLException;

import java.util.HashMap;

import jakarta.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

//@Configuration
//@EnableJpaRepositories(basePackages = {"com.oracle.fcr.ngi.audit.repository", "com.oracle.fcr.ngi.il.audit.repository"}, entityManagerFactoryRef = "auditEntityManager", transactionManagerRef = "auditTransactionManager")
public class AuditJpaConfig {
    /*private static final Logger logger = LoggerFactory.getLogger(AuditJpaConfig.class);
    @Value("${spring.jpa.timeout-sec}")
    private int timeout;

    @Autowired
    private Environment env;

    private HashMap<String, Object> jpaProperties() {
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.dialect", env.getProperty("spring.jpa.database-platform"));
        properties.put("hibernate.default_schema", env.getProperty("spring.audit-datasource.schema"));
        return properties;
    }

    @Bean(name = "auditDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.audit-datasource")
    public DataSourceProperties auditDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name = "auditDataSource")
    @ConfigurationProperties(prefix = "spring.audit-datasource.tomcat")
    public DataSource auditDataSource(
            @Qualifier("auditDataSourceProperties") DataSourceProperties dataSourceProperties) {
        org.apache.tomcat.jdbc.pool.DataSource auditDataSource = dataSourceProperties.initializeDataSourceBuilder().type(org.apache.tomcat.jdbc.pool.DataSource.class)
                .build();

        try (Connection connection = auditDataSource.getConnection()) {
            logger.info("Audit database Connected");
        } catch (SQLException e) {
            logger.error("Failed to connected audit database, message: {}", e.getMessage());
        }
        return auditDataSource;
    }

    @Bean(name = "auditEntityManager")
    public LocalContainerEntityManagerFactoryBean auditEntityManager(
            EntityManagerFactoryBuilder builder, @Qualifier("auditDataSource") DataSource dataSource) {
        return builder.dataSource(dataSource)
                .packages(
                        "com.oracle.fcr.ngi.audit.entity",
                        "com.oracle.fcr.ngi.il.audit.entity")
                .properties(jpaProperties())
                .build();
    }

    @Bean(name = "auditTransactionManager")
    public PlatformTransactionManager auditTransactionManager(
            @Qualifier("auditEntityManager") EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setDefaultTimeout(timeout);
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }

    @Bean(name = "auditJdbcTemplate")
    public JdbcTemplate auditJdbcTemplate(@Qualifier("auditDataSource") DataSource dataSource) throws SQLException {
        dataSource.getConnection().setAutoCommit(false);
        return new JdbcTemplate(dataSource);
    }*/

}
