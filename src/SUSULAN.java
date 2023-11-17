import java.util.Scanner;
public class SUSULAN {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Masukkan kata atau kalimat : ");
        String input = S.nextLine().toLowerCase();
        String[] words = input.split(" ");
        int maxWordValue = 0;
        String maxWord = "";

        for (String word : words) {
            int wordValue = calculateWordValue(word);
            if(wordValue >= maxWordValue) {
                maxWordValue = wordValue;
                maxWord = word;
            }
            System.out.println("Nilai kata \"" + word + "\": " + wordValue);
        }
        System.out.println("Nilai terbesar ada pada kata : " + maxWord + ", dengan nilai " + maxWordValue);
    }
    private static int calculateWordValue(String word) {
        int wordValue = 0;
        for (int i = 0; i < word.length();i++) {
            char letter = word.charAt(i);
            wordValue += letter - 'a' + 1;
        }
        return wordValue;
    }
}