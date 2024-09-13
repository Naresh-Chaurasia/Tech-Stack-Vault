package org.example;

import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.IOException;

public class JSON1 {
    public static void main(String[] args) {
        try {
            // Read JSON from a file
            File jsonFile = new File("/Users/nareshchaurasia/nc/Tech-Stack-Vault/automation/JSON/src/main/resources/file1.json");

            // Parse the file and extract the title of the first book
            String firstBookTitle = JsonPath.parse(jsonFile).read("$.store.book[0].title");

            System.out.println("First Book Title: " + firstBookTitle);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
