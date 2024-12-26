package tw.brad.stest4.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	@Before("execution(* tw.brad.stest4..*(..))")
	public void doBefore() {
		System.out.println("doBefore()");
	}

	@After("execution(* tw.brad.stest4..*(..))")
	public void doAfter() {
		System.out.println("doBefore()");
	}

}
