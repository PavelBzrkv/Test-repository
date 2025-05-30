package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(myConfig.class);

        UniLibrary unilibrary = context.getBean("uniLibrary", UniLibrary.class);

        Book book = context.getBean("book", Book.class);

        unilibrary.getBook();
//        unilibrary.returnMagazine();
        unilibrary.addBook("Zaur", book);
        unilibrary.addMagazine();

//        unilibrary.returnBook();
//        unilibrary.getMagazine();




//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();


        context.close();
    }
}
