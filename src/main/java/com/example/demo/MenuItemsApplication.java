package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.FoodInfo;
import beans.HealthInfo;
import controller.BeanConfiguration;
import reposit.FoodInfoRepository;

@SpringBootApplication
public class MenuItemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MenuItemsApplication.class, args);
	}
	
	@Autowired
	FoodInfoRepository repo;
	
	public void run(String...args) throws Exception{
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		FoodInfo f = appContext.getBean("foodInfo", FoodInfo.class);
		f.setPrice(10.50);
		repo.save(f);
		
		FoodInfo i = new FoodInfo("Salad", 10.50);
		HealthInfo h = new HealthInfo(10, 200);
		i.setHealthInfo(h);
		repo.save(i);
		
		List<FoodInfo> allMyFoodInfo = repo.findAll();
		for(FoodInfo people: allMyFoodInfo) {
			System.out.println(people.toString());
		}
		
		((AnnotationConfigApplicationContext) appContext).close();
	}

}
