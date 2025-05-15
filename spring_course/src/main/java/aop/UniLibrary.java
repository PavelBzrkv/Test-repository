package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{


    public void getBook(Book book){
        System.out.println("Берем книгу из UniLibrary " + book.getName());
    }

//    public void returnBook(){
//        System.out.println("Возврат книги в UniLibrary");
//    }

    public void getMagazine(){
        System.out.println("Берем журнал из UniLibrary");
    }
}
