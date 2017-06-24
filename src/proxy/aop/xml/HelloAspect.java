package proxy.aop.xml;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


public class HelloAspect {
	
//	前置增强
//	@Before("execution(* proxy.aop.*.*(..))")
	public void beforeMethod(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();		
		Object target = joinPoint.getTarget();
		Object proxy = joinPoint.getThis().toString();
		System.out.println("before " + methodName + ' ' + Arrays.asList(args) + ' ' + target.toString());
		System.out.println(proxy);
		
	}
	
	//后置增强
//	@After("execution(* proxy.aop.HelloImpl.*(..))")
	public void afterMethod(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.println("after " + methodName + Arrays.asList(args));
	}
	
	//环绕增强，需要调用目标对象方法
//	@Around("execution(* proxy.aop.*.*(..))")
	public int AroundMethod(ProceedingJoinPoint joinPoint) throws Throwable{
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.println("before  " + methodName + Arrays.asList(args));
		//调用目标对象方法
		int res = (int) joinPoint.proceed();
		System.out.println("after  " + methodName + Arrays.asList(args));
		return res;
	}
	
}
