package com.springframework.masterclass.spring_aop_demo;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {
	
	//Pointcut
	//location where to running
	
	//Simply what is something we want to call and where to call
	
	@Before("execution(* com.springframework.masterclass.spring_aop_demo.ShoppingCart.checkout(..))")
	public void beforeLogger(JoinPoint jp) {
//		System.out.println(jp.getSignature());
		String arg = jp.getArgs()[0].toString();
		System.out.println("Before loggers with Arguments: " + arg);
	}
	
	// *-> any return type *-> any package *->any class
	@After("execution(* *.*.*.*.*.checkout(..))")
	public void afterLogger() {
		System.out.println("After logger");
	}
	
	@Pointcut("execution(* com.springframework.masterclass.spring_aop_demo.ShoppingCart.quantity(..))")
	public void afterReturningPointCut() {
		
	}
	
	@AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
	public void afterReturning(String retVal) {
		System.out.println("After Returning: " + retVal);
	}

}
