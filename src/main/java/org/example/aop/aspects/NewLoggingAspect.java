package org.example.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: ATTEMPT to return a book to the Library");

        long startTime = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        targetMethodResult = "God of WAR"; //can change the returned value

        long endTime = System.currentTimeMillis();

        System.out.println("Method returnBook took: " + (endTime - startTime));

        System.out.println("aroundReturnBookLoggingAdvice: the book is SUCCESSFULLY returned to the Library");

        return targetMethodResult;
    }
}
