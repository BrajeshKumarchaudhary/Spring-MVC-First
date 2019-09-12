package org.study.object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.study.interfaces.Man;
@Component()
public class Mohit implements Man {
    @Autowired //this makes to create object  of that class avoid null pointer Exception
	Fruit fruit;
	
	
	
	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return "Hello brajesh kumar and mohit Eat the "+fruit.getFruitname();
	}

}
