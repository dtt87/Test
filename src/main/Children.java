package main;

import org.junit.Test;

public class Children extends Father{
	
	public void c_Method(String name){
		Method(name);
	}
	
	public void c_Method2(){
		
		System.out.println(getName());
	}
}
