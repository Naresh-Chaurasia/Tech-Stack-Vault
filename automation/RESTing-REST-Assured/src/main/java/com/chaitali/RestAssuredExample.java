package com.chaitali;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class RestAssuredExample {
    public static void main(String[] args) {
        // Set the base URI for the API
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // Perform a GET request to fetch users
        Response response = given()
                .when()
                .get("/users")
                .then()
                .statusCode(200) // Assert that status code is 200 (OK)
                .extract()
                .response();

        // Print the response body
        System.out.println("Response Body:");
        System.out.println(response.asString());
    }
}
