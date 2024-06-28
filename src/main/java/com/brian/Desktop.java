package com.brian;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer
{
public Desktop(){
    System.out.println("desktop object created");
}
    @Override
    public void compile() {
        System.out.println("Compiling using desktop");
    }
}
