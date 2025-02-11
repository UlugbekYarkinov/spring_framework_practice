package org.example.aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void get*())") //this is a pointcut with a wildcard
    public void beforeGetBookAdvice() {
        System.out.println("Before getBookAdvice: Attempt to get a book");
    }


}
