package com.chaitali.p1;

import com.github.javafaker.Faker;
import com.studentapp.model.StudentPojo;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.List;

public class RestAssured8_PUT_Pojo {
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

        // Sending POST request
        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(student) // Setting the body
                .when()
                .put("http://localhost:8080/student/1")  // API endpoint
                .then()
                .extract().response();

        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
}
