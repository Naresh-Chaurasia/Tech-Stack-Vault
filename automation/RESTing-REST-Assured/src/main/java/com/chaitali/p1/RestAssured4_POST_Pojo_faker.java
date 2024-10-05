package com.chaitali.p1;

import com.github.javafaker.Faker;
import com.studentapp.model.StudentPojo;

import java.util.ArrayList;
import java.util.List;

public class RestAssured4_POST_Pojo_faker {
    public static void main(String[] args) {

        StudentPojo student = new StudentPojo();
        Faker fake = new Faker();

        List<String> courses = new ArrayList<String>();
        courses.add("Java");
        courses.add("C++");

        student.setFirstName(fake.name().firstName());
        student.setLastName(fake.name().lastName());
        student.setEmail(fake.internet().emailAddress());

        student.setProgramme("Computer Science");
        student.setCourses(courses);

        System.out.println(student.getFirstName());

    }
}
