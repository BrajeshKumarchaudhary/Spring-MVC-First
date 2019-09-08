package org.study.object;

import org.springframework.stereotype.Component;
import org.study.interfaces.Man;
@Component()
public class Mohit implements Man {

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return "Hello brajes kumar and mohit";
	}

}
