package org.example;

import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.util.*;

public class StudentsJson1 {

    public static void main(String[] args) {
        try {
            // Read JSON from a file
            File json = new File("/Users/nareshchaurasia/nc/Tech-Stack-Vault/automation/JSON/src/main/resources/students-2.json");

            // Fetch values using JsonPath and store them in strings
            String firstId = JsonPath.parse(json).read("$[0].id").toString();
            String secondFirstName = JsonPath.parse(json).read("$[1].firstName");
            String firstLastName = JsonPath.parse(json).read("$[0].lastName");
            String secondEmail = JsonPath.parse(json).read("$[1].email");
            String firstProgramme = JsonPath.parse(json).read("$[0].programme");
            List<String> allFirstNames = JsonPath.parse(json).read("$[*].firstName");
            List<String> firstPersonCourses = JsonPath.parse(json).read("$[0].courses");
            String secondPersonSecondCourse = JsonPath.parse(json).read("$[1].courses[1]");
            List<String> allEmails = JsonPath.parse(json).read("$[*].email");
            List<Integer> allIds = JsonPath.parse(json).read("$[*].id");

            // Display the values
            System.out.println("First ID: " + firstId);
            System.out.println("Second Person's First Name: " + secondFirstName);
            System.out.println("First Person's Last Name: " + firstLastName);
            System.out.println("Second Person's Email: " + secondEmail);
            System.out.println("First Person's Programme: " + firstProgramme);
            System.out.println("All First Names: " + allFirstNames);
            System.out.println("First Person's Courses: " + firstPersonCourses);
            System.out.println("Second Person's Second Course: " + secondPersonSecondCourse);
            System.out.println("All Emails: " + allEmails);
            System.out.println("All IDs: " + allIds);


            System.out.println("Done");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
