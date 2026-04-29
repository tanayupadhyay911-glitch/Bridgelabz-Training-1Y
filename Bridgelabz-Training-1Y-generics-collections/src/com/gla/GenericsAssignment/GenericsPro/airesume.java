package com.gla.GenericsAssignment.GenericsPro;

import java.util.*;

abstract class JobRole {}

class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}
class ProductManager extends JobRole {}

class Resume<T extends JobRole> {

    T role;

    Resume(T role){
        this.role = role;
    }

    void process(){
        System.out.println("Processing " + role.getClass().getSimpleName());
    }

    static void pipeline(List<? extends JobRole> roles){
        for(JobRole r : roles){
            System.out.println("Screening " + r.getClass().getSimpleName());
        }
    }
}
