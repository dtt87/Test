package proxy.aop;


import org.springframework.stereotype.Component;


@Component("hello")
//若括号里不写注册 Bean 名，则默认按照该类的驼峰式命名
//例如，该类注册的 Bean 名为 "helloImpl"
public class HelloImpl implements Hello{

	@Override
	public int sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("Hello" + name);
		return 1;
	}
	
	public void sayTwo(){
		System.out.println("sayTwo");
	}
}
