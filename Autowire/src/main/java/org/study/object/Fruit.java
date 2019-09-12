package org.study.object;

import org.springframework.stereotype.Component;

@Component
public class Fruit {
	String fruitname;
	public Fruit() {
		fruitname="Apple";
		// TODO Auto-generated constructor stub
	}
	public String getFruitname() {
		return fruitname;
	}
	public void setFruitname(String fruitname) {
		this.fruitname = fruitname;
	}

}
