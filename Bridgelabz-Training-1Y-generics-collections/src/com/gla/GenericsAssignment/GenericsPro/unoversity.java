package com.gla.GenericsAssignment.GenericsPro;

import java.util.*;

abstract class CourseType {}

class ExamCourse extends CourseType {}
class AssignmentCourse extends CourseType {}
class ResearchCourse extends CourseType {}

class Course<T extends CourseType> {

    List<T> courses = new ArrayList<>();

    void add(T course){
        courses.add(course);
    }

    static void display(List<? extends CourseType> list){
        for(CourseType c : list){
            System.out.println(c.getClass().getSimpleName());
        }
    }
}
