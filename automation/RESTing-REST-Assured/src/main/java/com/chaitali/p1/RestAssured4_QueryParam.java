package com.chaitali.p1;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestAssured4_QueryParam {

    //http://localhost:8080/student/list?programme=Computer%20Science
    //http://localhost:8080/student/list?programme=Computer%20Science&limit=1
    public static void main(String[] args) {
        Map<String,Object> params =  new HashMap<String, Object>();
        params.put("programme", "Computer Science");
        params.put("limit",1);


        Response response =
                given()
                        //.queryParam("programme", "Computer Science")
                        //.queryParam("limit", 1)
                        //.queryParams("programme", "Computer Science", "limit", 1)
                        .queryParams(params)
                        .when()
                        .get("http://localhost:8080/student/list");

        response.prettyPrint();
    }
}
