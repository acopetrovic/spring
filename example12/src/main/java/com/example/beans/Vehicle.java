package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("Printing hello from component vehicle bean");
    }

    @Override
    public String toString() {
        return "Vehicle name is - " + name;
    }
}
