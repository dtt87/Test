package main;

import org.junit.Before;
import org.junit.Test;

public class Father {
	
	private String name = "12143";
	private int age=1;

	public void Method(String name){
		if(age!= 0)
		 this.name = name;
		
	}

	public String getName(){		
		return this.name; 
		
	}
	
	
}
