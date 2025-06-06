package aop.Aspect;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspects {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary(){}
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log#10");
//    }




//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){}
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//    System.out.println("beforeGetLoggingAdvice: writing Log #1");
//}
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }




//    @Pointcut("execution(*  get*())")
//    private  void allAddtMethods(){}
//
//    @Before("allAddtMethods()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }
//    @Before("allAddtMethods()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала");
//    }

    @Before("aop.Aspect.MyPointCut.allAddtMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature Method = " + methodSignature.getMethod());
        System.out.println("methodSignature ReturnType= " + methodSignature.getReturnType());
        System.out.println("methodSignature Name = " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
            Object [] arguments = joinPoint.getArgs();
            for(Object obj: arguments){
                if(obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Info: "+ myBook.getName()+" Author: "+
                            myBook.getAuthor()+ " Year: "+
                            myBook.getYearOfPublication());
                }
                else if (obj instanceof String) {
                    System.out.println("Book add to library: " + obj);
                }
            }
        }
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
        System.out.println("--------------------------------");
    }
}
