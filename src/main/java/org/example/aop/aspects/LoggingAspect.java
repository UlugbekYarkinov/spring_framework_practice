package org.example.aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void org.example.aop.UniLibrary.getBook())") //this is a pointcut
    public void beforeGetBookAdvice() {
        System.out.println("Before getBookAdvice: Attempt to get a book");
    }
}
