package org.example;

import java.io.*;
import java.util.regex.*;

public class XMLTagExtractor {
    public static void main(String[] args) {
        String filePath = "src/main/resources/country.xml";
        extractTagContent(filePath);
    }

    public static void extractTagContent(String filePath) {
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File not found at: " + file.getAbsolutePath());
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            StringBuilder xmlContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                xmlContent.append(line).append("\n");
            }


            Pattern pattern = Pattern.compile(">([^<]+)<");
            Matcher matcher = pattern.matcher(xmlContent.toString());

            boolean found = false;
            while (matcher.find()) {
                String content = matcher.group(1).trim();
                if (!content.isEmpty()) {
                    System.out.println(content); // Print the content
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No content found.");
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
