package com.brian;


import com.brian.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        Alien obj = new Alien();
//        obj.code();
        //now creating this object with the help of spring
        // will create the object and keep it in the IOC container, ApplicationContext is responsible to work with the IOC container
   // application context  will  help u to  create the container and get the objects from the container , BeanFactory is the deprecated method of doing that
    //applicationcontext is part of the spring framework not java so u gonna add its dependency in the pom file
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //creates the container
//        Alien obj = (Alien) context.getBean("alien");
//        obj.code();
//
//        System.out.println(obj.getAge());

//        Alien obj1 = (Alien) context.getBean("alien"); // gets the objects from the container, spring has to inject the object into the container
//        Alien obj2 = (Alien) context.getBean("alien"); // gets the objects from the container, spring has to inject the object into the container
//        obj1.code();
//        obj2.code();

       //
        // Laptop lap = (Laptop) context.getBean("laptop");
        // by default the singleton loads the object directly when the spring.xml is configured even without retrieving the object from the container
        //meanwhile for prototype u must explicitly say getBean
       // lap.compile();

        //by default the scope is singleton in the bean tag which means that  those  the object is created once
        // the 2 references referenced to thesame object, however if the scope is protopype means that  each a new object is created for each reference
        //beans are objects managed by the spring framework

//        Desktop des = (Desktop) context.getBean("com1");
        // using the java based approach instead of xml approach

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien obj1 = context.getBean(Alien.class);
        //obj1.setAge(21);
        System.out.println(obj1.getAge());
        obj1.code(); //the code is dependent on the object of the computer, this.com is null by default, it will need to have a reference to the bean(either laptop or desktop)

//        Desktop dt = context.getBean("desktop", Desktop.class);
//        dt.compile();
//        Desktop des = context.getBean("desktop", Desktop.class);
//        dt.compile();








    }
}
