package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        Files.readAllLines(path, charset);
        Scanner myObj = new Scanner(System.in);
        String result = "";
        String read = String.valueOf(Files.readAllLines(path));
        read = read.substring(1);
        read = read.substring(0, read.length() - 1);
        List<String> flights = new ArrayList<String>(Arrays.asList(read.split(",")));
        for (int i = 0; i < flights.size(); i++) System.out.println(flights.get(i));

        System.out.println("Chose starting point");
        String city = myObj.nextLine();
        for (int i = 0; i < flights.size(); i++) {
            String planing = flights.get(i);
            String planingArr[] = planing.split("->");
            if (city.equals(planingArr[0])) {
                result = " " + planingArr[1];

            }
        }
        System.out.println("You can fly to " + result);
    }
}
