package GuessTheWord;

import java.util.Scanner;

public class GuessTheWord {
    private boolean play = true;
    GenerateWords word = new GenerateWords();
    Scanner sc = new Scanner(System.in);

    public void start() {
        do {
            System.out.println("Guess the word!");
            showWord();
            getInput();
            checkInput();
        } while (play);
    }

    public void showWord() {
        System.out.println(word);
    }

    public void getInput() {
        System.out.println("Enter a letter to guess the word!");
        String letter = sc.next();
        word.guess(letter.charAt(0));
    }

    public void checkInput() {
        if (word.checkInput()) {
            System.out.println("You have guessed the word\nThe word is: " + word);
            play = false;
        }
    }
}
