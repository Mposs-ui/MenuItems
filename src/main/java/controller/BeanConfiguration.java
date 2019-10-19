package controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.FoodInfo;
import beans.HealthInfo;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public FoodInfo foodInfo() {
		FoodInfo bean = new FoodInfo();
		bean.setName("Salad");
		bean.setPrice(10.50);
		return bean;
	}
	
	@Bean
	public HealthInfo healthInfo() {
		HealthInfo bean = new HealthInfo(350, 10);
		return bean;
	}

}
