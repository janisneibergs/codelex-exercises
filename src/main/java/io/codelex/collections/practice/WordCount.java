package io.codelex.collections.practice;

import java.io.*;
import java.net.URISyntaxException;

public class WordCount {

    public static void main(String[] args) throws IOException, URISyntaxException {

        File file = new File("/Users/janisneibergs/Desktop/code/codelex-exercises/src/main/java/io/codelex/collections/practice/lear.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        int wordCount = 0;
        int characterCount = 0;
        int lineCount = 0;


        while ((line = bufferedReader.readLine()) != null) {
            lineCount += 1;
            characterCount += line.length();
            String words[] = line.split("\\s+");
            wordCount += words.length;


        }
        System.out.println("Lines = " + lineCount);
        System.out.println("Words = " + wordCount);
        System.out.println("Chars = " + characterCount);
        
    }
}
