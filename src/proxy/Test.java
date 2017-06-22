package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.ClassLoader;

public class Test {
	
//	private HelloImpl target;
	
	
	

	public static void main(String[] args) {
		
//		HelloProxy proxy = new HelloProxy();
//		proxy.sayHello("my");
				
		
		
		/**
		 * 动态代理实现步骤
		 */
		// 1.通过实现 InvocationHandler 接口创建自己的调用处理器,并能实现方法调用从代理类到委托类的分派转发
		//   其构造函数的入参通常是委托类的的引用
//		Hello hello = new HelloImpl();
//		DynamicProxy dynamicProxy = new DynamicProxy(hello);
//		System.out.println(hello.getClass().getClassLoader());
//		// 2.通过  Proxy.newProxyInstance(...) 方法创建动态代理实例
//		Hello helloProxy = (Hello) Proxy.newProxyInstance(				
//				hello.getClass().getClassLoader(), 
//				hello.getClass().getInterfaces(), 
//				dynamicProxy);
		
		//可以再次简化，封装第二步
//		DynamicProxy dynamicProxy = new DynamicProxy(new HelloImpl());
//		Hello helloProxy = dynamicProxy.getProxy();
		
//		helloProxy.sayHello("java");
//		helloProxy.sayTwo();
		
		Hello hello = new HelloImpl();
		Hello helloProxy =  new HelloDyProxy(new HelloImpl()).getProxy();
		
		helloProxy.sayHello("jack");
		
	}

}
