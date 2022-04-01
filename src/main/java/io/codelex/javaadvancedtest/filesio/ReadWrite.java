package io.codelex.javaadvancedtest.filesio;

import java.io.*;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
        String path = "/Users/janisneibergs/Desktop/code/codelex-exercises/src/main/java/io/codelex/javaadvancedtest/filesio/";
        String inputFileName = "textRead";
        StringBuilder outputFileName = new StringBuilder(inputFileName);
        outputFileName.reverse();
        outputFileName.toString();
        FileInputStream in = new FileInputStream(path + inputFileName + ".txt");
        FileOutputStream out = new FileOutputStream(path + outputFileName + ".txt");
        try {
            int n;
            while ((n = in.read()) != -1) {
                out.write(n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        System.out.println("Izveidota faila kopija");
    }
}

