package com.chaitali.p1;

import com.studentapp.tests.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class StudentGetRequestTests extends TestBase {


	
	@DisplayName("Getting all the student from the database")
	@Test
	void getAllStudents() {
		
		RestAssured.given()
				   .when()
		           .get("/list")
		           .then()
		           .statusCode(200);
		
	}
	
	//@Disabled
	@DisplayName("Get a single CS student from the list")
	@Test
	void getSingleCSStudent() {
		
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
		.get("/list");
		
		response.prettyPrint();
			
	}
	
	@DisplayName("PathParameterExample: Get the firstStudent")
	@Test
	void getTheFirstStudent() {
		
		Response response = 
				given()
				.pathParam("id", 2)
				.when()
				.get("/{id}");
		
		response.prettyPrint();
		
//		RestAssured.reset();
//		
//		Response response2 = 
//				given()
//				.pathParam("id", 2)
//				.when()
//				.get("/{id}");
//		
//		response.prettyPrint();
		
	}
	
}
