package org.study.object;

import org.springframework.stereotype.Component;
import org.study.interfaces.Food;
@Component("food2")
public class Food2 implements Food {

	@Override
	public String food() {
		// TODO Auto-generated method stub
		return "buttor";
	}

}
