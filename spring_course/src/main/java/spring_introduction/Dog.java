package spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet{
//    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    protected void init(){
        System.out.println("Class Dog: init method");
    }

    private void destroy(){
        System.out.println("Class Dog: destroy method");
    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }
}
