package com.vfislk.training;

import java.util.Arrays;
import java.util.List;

public class User {

	public String greet(String userName) {
		return "Greatday "+userName;
	}
	public  List<String> showFruits(){
		return Arrays.asList("Apple","Mango","Watermelon");
	}
}
