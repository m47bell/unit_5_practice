package nyc.c4q.m47bell;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by c4q-marbella on 12/5/15.
 * Access Code 2-1
 */
public class Hangman {

    public String secretWord(ArrayList<String> wordSecret) {

        int randomPosition = (int) (Math.random() * wordSecret.size() - 1);

        return wordSecret.get(randomPosition);
    }

    public String printDashes(String secretWord) {

        String dash = "-";

        for (int i = 0; i < secretWord.length(); i++) {

            dash += dash;
        }
        return dash;
    }


    public void checkCharInput(char input, String secretWord) {
        String hint = "";
        int count = 0;
        boolean goodGuess = false;

        for (int i = 0; i < secretWord.length(); i++) {
           if(secretWord.charAt(i) == input){
               goodGuess = true;
//               System.out.println(printDashes(secretWord.substring(0, i)) + i + printDashes(secretWord.substring(i + 1, secretWord.length() + 1)));
           }
//       if wrong char, count as wrong guess, and terminate if count = 8
//               count ++;
//            System.out.println("There are no " + input);
//            printDashes(secretWord);
        }
    }



}

