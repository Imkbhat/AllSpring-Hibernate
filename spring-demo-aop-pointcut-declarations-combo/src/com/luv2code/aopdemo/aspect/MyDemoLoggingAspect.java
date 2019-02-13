package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {
		
	}
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
	public void getter() {
		
	}
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
	public void setter() {
		
	}
	
	@Pointcut("forDaoPackage() && !(getter() || setter())") 
	public void combinedGetterSetter() {
		
	}
	
	
	@Before("combinedGetterSetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n=======>>> Excecuting @Before  Advice on method()");
	}
	
	@Before("combinedGetterSetter()")
	public void apiAnalytics() {
		System.out.println("\n====>> In apianalytics()");
	}
	
	
}
