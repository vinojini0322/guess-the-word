package GuessTheWord;

import java.util.Arrays;
import java.util.Random;

public class GenerateWords {
    Random rn = new Random();
    private String selectedWord;
    private char[] letters;

    public GenerateWords() {
        String[] randomWordList = {"diamond", "passenger", "engineering", "confusion",
                                   "appearance", "artisan", "chocolate", "trainer",
                                   "atmosphere", "drawing", "criticism", "affair", "song",
                                   "intention", "anxiety", "series", "flight", "hospital",
                                   "revolution", "growth", "sister", "university",
                                   "explanation", "year", "student"};
        this.selectedWord = randomWordList[rn.nextInt(randomWordList.length)];
        letters = new char[selectedWord.length()];
    }

    public String toString() {
        StringBuilder word = new StringBuilder();
        for (char letter : letters) {
            word.append(letter == '\u0000' ? '-' : letter);
            word.append(' ');
        }
        return word.toString();
    }

    public void guess(char letter) {
        for (int i = 0; i < selectedWord.length(); i++) {
            if (letter == selectedWord.charAt(i)) {
                letters[i] = letter;
            }
        }
    }

    public boolean checkInput() {
        for (char l : letters) {
            if (l == '\u0000') {
                return false;
            }
        }
        return true;
    }
}
