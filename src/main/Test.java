package main;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Father father = new Father();
		
		
		Children children = new Children();
		children.c_Method("234");
		children.c_Method2();
		
		String aak110 = "1234";
		Long.parseLong(aak110);
		
		HashMap<String, Object> con = new HashMap<String, Object>();
		con.put("aak110", "123");
		con.put("aak111", "1234");
		System.out.println(con);
		
		con.put("aak110", "12");
		System.out.println(con);
		
//		List<String> li = new List<String>();
		List<String> names=new ArrayList<>(); 
	      names.add("刘备");  //索引为0 
	      names.add("关羽");  //索引为1 
	      names.add("张飞");  //索引为2 
	      names.add("刘备");  //索引为3 
	      names.add("张飞");  //索引为4 
	      System.out.println(names.indexOf("刘备")); 
	      System.out.println(names.lastIndexOf("刘备")); 
	      System.out.println(names.indexOf("张飞")); 
	      System.out.println(names.lastIndexOf("张飞")); 
	      
	      System.out.println(names); 
	}
}
