package com.chaitali.p1;

import com.github.javafaker.Faker;
import com.studentapp.model.StudentPojo;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.List;

public class RestAssured8_Delete_Pojo {
    public static void main(String[] args) {

        // Sending POST request
        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .when()
                .delete("http://localhost:8080/student/6")  // API endpoint
                .then()
                .extract().response();

        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
}
