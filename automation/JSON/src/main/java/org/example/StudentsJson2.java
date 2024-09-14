package org.example;

import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.util.List;

public class StudentsJson2 {

    public static void main(String[] args) {
        try {
            // Read JSON from a file
            File json = new File("/Users/nareshchaurasia/nc/Tech-Stack-Vault/automation/JSON/src/main/resources/students-2.json");

            int totalStudents = JsonPath.parse(json).read("$.length()");
            System.out.println(totalStudents);

            int numberOfCoursesFirstStudent = JsonPath.parse(json).read("$.[0].courses.length()");
            System.out.println(numberOfCoursesFirstStudent);

            String email = JsonPath.parse(json).read("$[1].email");
            boolean emailContainsDomain = email.contains("@Duisac.net");
            System.out.println(emailContainsDomain);

            System.out.println("Done");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
