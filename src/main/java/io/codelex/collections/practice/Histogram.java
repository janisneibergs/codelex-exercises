package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> result = Files.readAllLines(path, charset);

        int[] counts = new int[11];
        for (int i = 0; i < result.size(); i++) {


            int num = Integer.parseInt(result.get(i));
            if (num > 0 && num < 10) counts[0]++;
            else if (num >= 10 && num < 20) counts[1]++;
            else if (num >= 20 && num < 30) counts[2]++;
            else if (num >= 30 && num < 40) counts[3]++;
            else if (num >= 40 && num < 50) counts[4]++;
            else if (num >= 50 && num < 60) counts[5]++;
            else if (num >= 60 && num < 70) counts[6]++;
            else if (num >= 70 && num < 80) counts[7]++;
            else if (num >= 80 && num < 90) counts[8]++;
            else if (num >= 90 && num < 100) counts[9]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(i * 10 + "-" + (i * 10 + 9) + ": ");
            for (int j = 0; j < counts[i]; j++)
                System.out.print("*");
            System.out.println();
        }
    }


    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
