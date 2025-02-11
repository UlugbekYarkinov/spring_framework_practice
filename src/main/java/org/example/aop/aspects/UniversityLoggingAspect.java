package org.example.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.example.aop.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice logging BEFORE getStudents()");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student firstStudent = students.get(0);
        String fullName = firstStudent.getFullName();
        fullName = "Mr. " + fullName;
        firstStudent.setFullName(fullName);

        double avgGrade = firstStudent.getAvgScore();
        avgGrade = avgGrade + 1;
        firstStudent.setAvgScore(avgGrade);

        System.out.println("afterReturningGetStudentsLoggingAdvice logging AFTER getStudents()");
    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice logging THROWING Exception getStudents()");
        System.out.println(exception);
    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice logging AFTER FINAL getStudents()");
    }
}
