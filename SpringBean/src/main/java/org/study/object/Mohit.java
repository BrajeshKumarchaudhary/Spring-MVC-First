package org.study.object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.study.interfaces.Food;
import org.study.interfaces.Man;

public class Mohit implements Man {
    @Autowired //this makes to create object  of that class avoid null pointer Exception
//    @Autowired(required = false) //this makes to create object  of that class avoid null pointer Exception
	// this is not possible it gives error due to ambiguity 
    @Qualifier("food2")//resolve ambiguity
    Food food;
    String name;
    @Override
	public String speak() {
		// TODO Auto-generated method stub
		return "Hello brajesh kumar and mohit Eat the"+food.food();
	}
	public Mohit() {
		// TODO Auto-generated constructor stub
	}
	public Mohit(Food food, String name) {
		this.food = food;
		this.name = name;
	}
	

}
