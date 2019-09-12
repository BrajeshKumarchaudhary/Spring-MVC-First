package org.study.object;

import org.springframework.stereotype.Component;
import org.study.interfaces.Food;
@Component("food1")
public class Food1 implements Food {

	@Override
	public String food() {
		// TODO Auto-generated method stub
		return "Bread";
	}

}
