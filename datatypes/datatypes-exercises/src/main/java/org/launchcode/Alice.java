package org.launchcode;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        String alice = "Alice was beginning" +
                " to get very tired of sitting by her " +
                "sister on the bank, and of having " +
                "nothing to do: once or twice she " +
                "had peeped into the book her sister " +
                "was reading, but it had no pictures " +
                "or conversations in it, ‘and what is " +
                "the use of a book,’ thought Alice " +
                "‘without pictures or conversation?";
        String newAlice = alice.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter word");

        String word = input.next();
        String newWord = word.toLowerCase();

        System.out.println(newAlice.contains(newWord));



    }
}
