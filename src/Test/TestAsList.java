package Test;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class TestAsList {
	public static void main(String[] args) {
		/**
		 * Arrays.asList() 可将 Object[] 转换为 ArrayList 输出其中所有元素
		 * 使用时注意
		 * 1. 基本数据类型：整个数组会当成一个元素存入List中
		 *   解决方法： 1) 取List数组第一个元素进行遍历
		 *   		2) ArrayUtils.toObject(int[] args) 先转成 Object[]
		 * 		
		 * 2. 该方法返回的并不是真正的 ArrayList,而是其中的一个内部类，并没有实现add、remove等更新方法，
		 *    因而对返回的 List 进行操作的时候会抛异常  UnsupportedOperationException 
		 */
		int[] a1 = {1,2,3};	
		Integer[] a2 = {1,2,3};
		
		String[]  b = {"a","b","c"};
		
		Object [] c = {1,"a","b",2};
			
		List a1list = Arrays.asList(a1);		
		// 遍历数组 int[] 
		for (int i : (int[])a1list.get(0)){
			System.out.println(i);
		}
		System.out.println(Arrays.asList(ArrayUtils.toObject(a1)));
		
		List a2list = Arrays.asList(a2);
		System.out.println(a2list);
		
		List blist = Arrays.asList(b);
//		blist.add("d"); //进行更改操作会报异常
		System.out.println(blist);
		
		List clist = Arrays.asList(c);
		System.out.println(clist);
		
	}
	
	
	

}
