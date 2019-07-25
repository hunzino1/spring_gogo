package com.shj.jdbc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ImportResource("classpath:spring-context.xml")
public class JdbcConfig {
    @Value("jdbc.url")
    private String url;
    @Value("jdbc.username")
    private String username;
    @Value("jdbc.password")
    private String password;

    @Bean("dataSource")
    public DataSource getDataSource() {
        return new DriverManagerDataSource(url, username, password);
    }

    @Bean
    public MyDriveManager myDriveManager() {
        return new MyDriveManager(url, username, password);
    }
}
