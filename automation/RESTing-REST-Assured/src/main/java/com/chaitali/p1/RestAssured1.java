package com.chaitali.p1;

import io.restassured.RestAssured;

public class RestAssured1 {
    public static void main(String[] args) {
        RestAssured.
                given().//header value / param value / token
                when(). // get call API
                then(); // read json and validate json.
    }
}
