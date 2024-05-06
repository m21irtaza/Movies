package Main;

import java.util.ArrayList;
import java.util.HashSet;


public class Split {
    public static void main(String[] args) {
        String text = "OOP allows objects to interact with each other using four basic principles: encapsulation, inheritance, polymorphism, and abstraction. These four OOP principles enable objects to communicate and collaborate to create powerful applications";
        ArrayList<String> sentences = new ArrayList<>();
        String[] OOP = text.split(" ");

        System.out.println(OOP[0]);
        for (String S : OOP) {
            System.out.println(S);
        }
        System.out.println("Total words: " + getTotalWords(OOP));
        System.out.println("Unique words: " + getUniqueWords(OOP));
        System.out.println("Total sentences: " + getTotalSentences(text));
        System.out.println("Total characters: " + getTotalCharacters(text));
        System.out.println("Size of ArrayList sentences: " + getArrayListSize(sentences));
    }

    public static int getTotalWords(String[] words) {
        return words.length;
    }
    public static int getTotalSentences(String text) {
        String[] sentences = text.split("[.!?]");
        return sentences.length;
    }
    public static int getTotalCharacters(String text) {
        return text.length();
    }
    public static int getArrayListSize(ArrayList<String> sentences) {
        return sentences.size();
    }
    public static int getUniqueWords(String[] words) {
        HashSet<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase()); // Consider words with different cases as the same word
        }
        return uniqueWords.size();
    }
}



