package org.study.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.study.object.Mohit;

@Configuration
@ComponentScan("org.study") //this is responsible for scanning all the classes and interfaces
public class AppConfig {
@Bean
public Mohit mohit()
{
	return new Mohit();
}
//@Bean("mohit")
//public Mohit mohit()
//{
//	return new Mohit(food, name); //This is parameterized constructor
//}
}
