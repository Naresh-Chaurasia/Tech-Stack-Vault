package com.chaitali.p1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class RestAssured2 {
    public static void main(String[] args) {
        // Perform a GET request to fetch users
        Response response = given()
                .when()
                .get("https://jsonplaceholder.typicode.com/users")
                .then()
                .statusCode(200) // Assert that status code is 200 (OK)
                .extract()
                .response();

        // Print the response body
        System.out.println("Response Body:");
        System.out.println(response.asString());
    }
}
