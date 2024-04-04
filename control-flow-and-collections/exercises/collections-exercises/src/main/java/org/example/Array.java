package org.example;
import java.util.Scanner;
public class Array {
    public static void main(String [] args) {
        int[] ray = {1, 1, 2, 3, 5, 8};
        int length = ray.length;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < length; i++) {
            if(ray[i]%2 != 0){
                System.out.println(ray[i]);
            }


        }
//        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        String[] words = phrase.split(" ");
//        System.out.println(Array.toString(words));


    }

}
