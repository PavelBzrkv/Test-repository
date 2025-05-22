package aop;

import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class UniLibrary extends AbstractLibrary{


    public void getBook(){
        System.out.println("Берем книгу из UniLibrary ");
        System.out.println("--------------------------------");
    }

    public String returnBook(){
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "Воина и мир";
    }

    public void getMagazine(){
        System.out.println("Берем журнал из UniLibrary");
        System.out.println("--------------------------------");
    }

    public void returnMagazine(){
        System.out.println("Возврат журнал в UniLibrary");
        System.out.println("--------------------------------");
    }

    public void addBook(String person_name, Book book ){
        System.out.println("Добавляем книгу в UniLibrary");
        System.out.println("--------------------------------");
    }
    public void addMagazine(){
        System.out.println("Добавляем журнал в UniLibrary");
        System.out.println("--------------------------------");
    }
}
