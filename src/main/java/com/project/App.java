package com.project;

import com.project.controller.CourseController;
import com.project.model.Course;

import java.util.List;

public class Pro {
    public Pro(String testname) {
    }

    public static void main(String[] args) {
         CourseController courseController =new CourseController();
         Course course = new Course();
         course.setName("Science");
         course.setDuration("1 month");
         course.setPrice(25000);
         course.setModules(List.of("Science","Chem","phy", "Biology"));
         courseController.addCourse(course);

    }
}
