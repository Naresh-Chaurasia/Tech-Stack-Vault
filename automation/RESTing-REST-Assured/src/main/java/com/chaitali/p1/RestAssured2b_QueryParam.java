package com.chaitali.p1;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestAssured2b_QueryParam {

    //http://localhost:8080/student/list?programme=Computer%20Science
    //http://localhost:8080/student/list?programme=Computer%20Science&limit=1
    public static void main(String[] args) {
        Map<String,Object> params =  new HashMap<String, Object>();
        params.put("programme", "Computer Science");
        params.put("limit",1);


        Response response =
                given()
                        .queryParams(params)
                        .when()
                        .get("http://localhost:8080/student/list");

        response.prettyPrint();
    }
}
