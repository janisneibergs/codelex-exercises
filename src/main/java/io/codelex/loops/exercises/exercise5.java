package io.codelex.loops.exercises;

public class exercise5 {
    public static void main(String[] args) {
        String sentence = "sjkdhd jsakdchd";
        String[] words = sentence.split("\\s+");
        int count = 30;
        count = count - words[0].length() - words[1].length();
        String firstWord = words[0];
        String secondWord = words[1];
        for(int i = 0; i<count; i++){
            firstWord = firstWord +".";

        }
        System.out.println(firstWord+secondWord);
    }
}
