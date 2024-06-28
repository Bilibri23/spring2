package com.brian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // telling spring that this class object will be managed by spring
public class Alien {
    @Value("90")
    private int age;// u will not assign directly  because spring boot has what we call injections, so u will make spring to inject the value for u

   // private Laptop laptop; //= new Laptop(); this is bcs since we use spring we want to inject the object
    //injection can be done on 3 levels; field, constructor and setter
    //RECOMMENDED TO USE AUTOWIRE ON SETTER INSTEAD
    @Autowired // telling spring  that  hey go to the container and searched for the computer object there
    //it will see 2 objects laptop and desktop, so u need to choose one using qualifier or primary.
    @Qualifier("laptop") // qualifier has a higher priority than primary
    private Computer com;  // alien is now dependent on computer and this computer can be anything(lap,mobilephone..etc)
    //laptop is dependent on alien but it will ve better to create a layer on top of laptop like a computer which is actually a concept

    public Alien(){
       // System.out.println("Object created");
    }
//    public Alien(int age, Laptop laptop){
//        this.age = age;
//        this.laptop = laptop;
//    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
//
//    public void code(){
//        System.out.println("coding");
//        laptop.compile();
//    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }
    public void code(){
        com.compile();
    }

    // apart from initialising the instance variables we also initialse from the constructor , so with spring we  will use constructor injection
    // such that it will be called by spring
    // but in spring for constructor we dont use the property tag
}
