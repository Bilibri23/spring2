package com.brian.config;

import com.brian.Alien;
import com.brian.Computer;
import com.brian.Desktop;
import com.brian.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.brian") //the advantage of the component annotations  is that u don't have to do any configuration again...wow

public class AppConfig {
    //@Bean(name ="com") // such spring create the object, manage and inject it

//   @Bean
//
////    @Scope("prototype") // by default, it is singleton
//    public Desktop desktop(){
//        return new Desktop();
//    }
//// the default name of your bean is your method name(in this case desktop)
//    @Bean
//    public Alien alien( Computer com1){ //alien dependent on computer object, desktop is implementation of computer.   @Qualifier("desktop")
//       // alen say hey container I want a computer object, it will look and say  hey I got a desktop object take that
//        Alien obj = new Alien(); //alien is dependent on 2 instance variables age and com so u got to initialise the two
//        obj.setAge(25);
//        obj.setCom(com1); // don't pass desktop directly cause u make it tightly coupled , better pass the computer reference
//        return obj;
//    }
//    @Bean
//    @Primary
//    public Laptop laptop(){
//       return new Laptop();
//    }
    // error since   when alien ask the container for  a computer object , it will say hey I have laptop and computer object which one exactly do u want
//WE can use primary bean or qualifier annotations
}
