package com.chaitali.p1;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestAssured2d_PathParam {

    //http://localhost:8080/student/2
    public static void main(String[] args) {


        Response response =
                given().pathParam("id", 2)
                        .when()
                        .get("http://localhost:8080/student/{id}");

        response.prettyPrint();
    }
}
