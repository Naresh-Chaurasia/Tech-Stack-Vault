package org.example;

import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSON2 {
    public static void main(String[] args) {
        try {
            // Read JSON from a file
            File jsonFile = new File("/Users/nareshchaurasia/nc/Tech-Stack-Vault/automation/JSON/src/main/resources/file1.json");

            // Parse the file and extract the title of the first book
            // Extract all book titles
            List<String> bookTitles = JsonPath.parse(jsonFile).read("$.store.book[*].title");

            System.out.println("Book Titles: " + bookTitles);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
