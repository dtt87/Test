package proxy;

/**
 * 
 * 静态代理
 * @author dong_tt
 *
 */

public class HelloProxy implements Hello {
	
	private Hello hello;
	
	/**
	 * 这是静态代理重点，构造函数会生成一个 HelloImpl 对象, 调用它的 sayHello 方法
	 */	
	public HelloProxy() {
		this.hello = new HelloImpl();
	}
	
	public void before(){
		System.out.println("before");
	}
	
	public void after(){
		System.out.println("after");
	}

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
//		before();
		hello.sayHello(name);
//		after();
	}

	@Override
	public void sayTwo() {
		// TODO Auto-generated method stub
		System.out.println("sayTwo");
	}

}
