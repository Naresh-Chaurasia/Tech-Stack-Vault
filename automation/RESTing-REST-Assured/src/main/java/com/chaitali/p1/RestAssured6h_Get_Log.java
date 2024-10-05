package com.chaitali.p1;

import static io.restassured.RestAssured.given;

public class RestAssured6h_Get_Log {
    public static void main(String[] args) {

        // Perform a GET request to fetch users
        given().
            log().
            headers() // log headers
            .when()
            .get("http://localhost:8080/student/list")
            .then()
            .log()
            .body();

    }
}
