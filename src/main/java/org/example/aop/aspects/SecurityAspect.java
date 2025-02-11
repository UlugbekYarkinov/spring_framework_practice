package org.example.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {
    @Before("org.example.aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetSecurityAdvice() {

        System.out.println("Before getSecurityAdvice: Check rights to get a book or a magazine");
    }
}
