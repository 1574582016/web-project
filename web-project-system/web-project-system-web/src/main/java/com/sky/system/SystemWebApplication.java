package com.sky.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
//@ComponentScan(basePackages={"com.sky.system.api.controller","com.sky.system.service"})
@MapperScan(basePackages={"com.sky.system.mapper"})
public class SystemWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemWebApplication.class, args);
	}
}
