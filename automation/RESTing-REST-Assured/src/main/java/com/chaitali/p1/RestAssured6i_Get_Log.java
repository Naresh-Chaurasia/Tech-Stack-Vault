package com.chaitali.p1;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestAssured6i_Get_Log {
    public static void main(String[] args) {

        Map<String,Object> params =  new HashMap<String, Object>();
        params.put("programme", "Computer Science");
        params.put("limit",-11);

        given()
                //.queryParam("programme", "Computer Science")
                //.queryParam("limit", 1)
                //.queryParams("programme", "Computer Science", "limit", 1)
                .queryParams(params)
                .when()
                .get("http://localhost:8080/student/list")
                .then()
                .log()
                .ifError();

    }
}
