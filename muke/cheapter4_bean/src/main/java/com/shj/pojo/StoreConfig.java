package com.shj.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfig {
	
	@Bean(name = "bean", initMethod = "init", destroyMethod = "destroy")
	public StringStore stringStore() {
		return new StringStore();
	}

}
