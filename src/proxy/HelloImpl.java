package proxy;

public class HelloImpl implements Hello{

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("Hello" + name);
	}
	
	public void sayTwo(){
		System.out.println("sayTwo");
	}
}
