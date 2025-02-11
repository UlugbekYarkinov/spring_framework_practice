package org.example.aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {
    @Pointcut("execution(* get*())")
    private void allGetMethods(){};

    @Before("allGetMethods()") //when we write the class Name it should be complete
    public void beforeGetLoggingAdvice() {
        System.out.println("Before getBookAdvice: Attempt to get a book or a magazine");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("Before getSecurityAdvice: Check rights to get a book or a magazine");
    }
}
