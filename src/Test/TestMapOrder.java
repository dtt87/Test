package Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestMapOrder {
	
	public static void main(String[] args) {
		
		//使用 LinkedHashMap 保证与输入顺序一致
		Map<Object, Object> map = new LinkedHashMap();
		map.put(1, 2);
		map.put(2, 3);
		map.put(3, 1);
		map.put("1001", 2);
		map.put("1002", 3);	
		
		for(Entry<Object, Object> e : map.entrySet()){
			System.out.println(e.getKey().toString() + e.getValue());
		}

	}

}
