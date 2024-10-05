package com.chaitali.p1;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssured4_POST {
    public static void main(String[] args) {

        String requestBody= "{\"firstName\":\"Vernon1\",\"lastName\":\"Harper1\",\"email\":\"egestas1.rhoncus.Proin@gmail.com\",\"programme\":\"Financial Analysis\",\"courses\":[\"Accounting\",\"Statistics\"]}";
        // Sending POST request
        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(requestBody) // Setting the body
                .when()
                .post("http://localhost:8080/student")  // API endpoint
                .then()
                .extract().response();

        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
}
