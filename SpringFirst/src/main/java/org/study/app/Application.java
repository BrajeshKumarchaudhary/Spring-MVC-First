package org.study.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.study.interfaces.Man;
import org.study.object.Mohit;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Man myman=context.getBean(Man.class);
		System.out.print(myman.speak());
		context.close();
	}

}
