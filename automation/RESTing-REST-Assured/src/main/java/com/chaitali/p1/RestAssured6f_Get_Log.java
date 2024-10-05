package com.chaitali.p1;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class RestAssured6f_Get_Log {
    public static void main(String[] args) {

        // Perform a GET request to fetch users
        given().
            log().
            headers() // log headers
            .when()
            .get("http://localhost:8080/student/list")
            .then()
            .log()
            .headers();

    }
}
