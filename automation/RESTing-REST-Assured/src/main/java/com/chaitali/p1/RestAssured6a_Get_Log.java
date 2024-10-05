package com.chaitali.p1;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class RestAssured6a_Get_Log {
    public static void main(String[] args) {

        // Perform a GET request to fetch users
        Response response = given().
                log().
                headers() // log headers
                .when()
                .get("http://localhost:8080/student/list");

        ValidatableResponse vr = response.then();
        vr.statusCode(200);

    }
}
