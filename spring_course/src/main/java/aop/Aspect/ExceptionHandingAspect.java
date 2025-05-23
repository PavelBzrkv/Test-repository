package aop.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandingAspect {
    @Before("aop.Aspect.MyPointCut.allAddtMethods()")
    public void beforeAddExceptionHandingAdvice(){
        System.out.println("beforeExceptionHandingAspectAdvice: " +
                "ловим/обрабатываем исключение при попытке получить книгу/журнал");
        System.out.println("--------------------------------");
    }

}
