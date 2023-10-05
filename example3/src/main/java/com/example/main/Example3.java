package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {

    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh12 = context.getBean("audiVehicle", Vehicle.class);
        System.out.println("Vehicle name for Spring context is: " + veh12.getName());

        Vehicle veh2 = context.getBean("hondaVehicle", Vehicle.class);
        System.out.println("Vehicle name for Spring context is: " + veh2.getName());

        Vehicle veh3 = context.getBean("yugoVehicle", Vehicle.class);
        System.out.println("Vehicle name for Spring context is: " + veh3.getName());

    }
}
