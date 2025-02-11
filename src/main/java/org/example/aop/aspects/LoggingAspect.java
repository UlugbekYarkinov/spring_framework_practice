package org.example.aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

//    @Pointcut("execution(* org.example.aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {}
//
//    @Pointcut("execution(public void org.example.aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() {}
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineFromUniLibrary() {
//        System.out.println("BEFORE ALL METHODS EXCEPT returnMagazine METHOD");
//    }

//    @Pointcut("execution(* org.example.aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {}
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Pointcut("execution(* org.example.aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {}
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary() {}
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }

    @Before("org.example.aop.aspects.MyPointcuts.allGetMethods()") //when we write the class Name it should be complete
    public void beforeGetLoggingAdvice() {
        System.out.println("Before getBookAdvice: Attempt Logging to get a book or a magazine");
    }


}
