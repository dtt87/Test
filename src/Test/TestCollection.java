package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



public class TestCollection {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
//		List<String> a = null;
//		List<String> b = new LinkedList<String>();
//		
////		a.add("a1");
//		b.add("b1");
//		
//		
//		System.out.println(a);
//		System.out.println(b);
//		
//		String c ="main.Children";
//		
//		System.out.println(Class.forName(c));
		
//		String str1 = new String("1");
//		String str3 = str1 + "2";
//		String str2 = new String("1");
		
		StringBuffer str1 = new StringBuffer("1");
		str1.append("2");
		StringBuffer str2 = new StringBuffer("1");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1 == str2);
		
		Map map = new HashMap();
		
		
	}
	
}
