package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 
 * 动态代理   另一种实现方法
 * @author dong_tt
 *
 */

public class HelloDyProxy {
	
	private Hello target;

	public HelloDyProxy(Hello target) {
		super();
		this.target = target;
	}
	
	public Hello getProxy(){
		
		Hello proxy = null;
		
		ClassLoader loader = target.getClass().getClassLoader();
		Class [] interfaces = new Class []{Hello.class};
		InvocationHandler h = new InvocationHandler(){

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				String name = method.getName();
				
				System.out.println("before" + name);
				
				Object result = method.invoke(target, args);
				
				System.out.println("after" + name);
				
				return result;
			}
			
			
		};
		
		proxy = (Hello) Proxy.newProxyInstance(loader, interfaces, h);
		return proxy;
		
		
	}
	

}
