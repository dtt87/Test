package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * @author dong_tt
 *
 */
public class DynamicProxy implements InvocationHandler {
	
	private Object target;

	public DynamicProxy(Object target) {
		super();
		this.target = target;
	}
	
	public void before(){
		System.out.println("before" );
	}
	
	public void after(){
		System.out.println("after" );
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		before();
	    method.invoke(target, args);
		System.out.println(args);
		after();
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getProxy(){
		
		return (T) Proxy.newProxyInstance(
				target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), 
				this);
	}

}
