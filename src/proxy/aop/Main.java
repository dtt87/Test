package proxy.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-aop.xml");
		Hello hello = (Hello) ctx.getBean("hello");
//		System.out.println(hello.getClass().getName());
		
		hello.sayHello("Jack");
//		System.out.println(res);
		
		HelloImpl helloImpl = new HelloImpl();
		helloImpl.sayHello("jlkj");
	}

}
