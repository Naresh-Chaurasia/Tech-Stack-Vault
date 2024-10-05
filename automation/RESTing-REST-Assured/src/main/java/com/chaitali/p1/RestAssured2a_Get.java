package com.chaitali.p1;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class RestAssured2a_Get {
    public static void main(String[] args) {
        // Set the base URI for the API
        //RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // Perform a GET request to fetch users
        Response response = given()
                .when()
                .get("http://localhost:8080/student/list");

        //response.prettyPrint();

        ValidatableResponse vr = response.then();
        vr.statusCode(200);

        //vr.statusCode(201);
    }
}
