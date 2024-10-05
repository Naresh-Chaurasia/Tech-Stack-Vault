package com.chaitali.p1;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestAssured2c_QueryParam {

    //http://localhost:8080/student/list?programme=Computer%20Science
    //http://localhost:8080/student/list?programme=Computer%20Science&limit=1
    public static void main(String[] args) {

        Response response =
                given()
                        .queryParams("programme", "Computer Science","limit", "1")
                        .when()
                        .get("http://localhost:8080/student/list");

        response.prettyPrint();
    }
}
