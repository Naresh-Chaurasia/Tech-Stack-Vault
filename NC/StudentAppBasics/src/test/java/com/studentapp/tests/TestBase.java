package com.studentapp.tests;

import org.junit.jupiter.api.BeforeAll;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class TestBase {

	@BeforeAll
	public static void init() {
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
	}

}
