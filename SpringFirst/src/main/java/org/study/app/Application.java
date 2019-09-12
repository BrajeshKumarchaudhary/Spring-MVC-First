package org.study.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.study.interfaces.Man;
import org.study.object.Mohit;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		//Creating the many of objects rather than new keywords spring provide component solution based.
		Man myman=context.getBean("mohit",Man.class); //here mohit object is created by inversion of control
		System.out.print(myman.speak());
		context.close();
	}

}
