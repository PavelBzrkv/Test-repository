package aop.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyPointCut {
    @Pointcut("execution(*  abc*(..))")
    public   void allAddtMethods(){}
}
