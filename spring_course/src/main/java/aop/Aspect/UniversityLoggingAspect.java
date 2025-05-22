package aop.Aspect;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение" +
//                " списка студентов перед методом getStudents");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())",
//    returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr." + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrad = firstStudent.getAvgGrade();
//        avgGrad = avgGrad + 1;
//        firstStudent.setAvgGrade(avgGrad);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение" +
//                " списка студентов после работы метода getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())",
//    throwing = "exeption")
//    public void afterThrowingGetLoggingStudentAdvice(Throwable exeption){
//        System.out.println("afterThrowingGetLoggingStudentAdvice: логируем выброс" +
//                " исключения " +exeption);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: логируем нормальное окончание" +
                " метода или выброс исключения");
    }
}