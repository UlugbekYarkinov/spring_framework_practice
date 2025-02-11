package org.example.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* abc*(..))") //changed this Pointcut from add to clear log
    public void allAddMethods(){}

}
