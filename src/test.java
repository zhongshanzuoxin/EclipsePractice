import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("1から100までの数を当ててみてください。");
        
        while (!hasGuessedCorrectly) {
            System.out.print("数を入力してください: ");
            int guess = scanner.nextInt();
            numberOfTries++;
            
            if (guess < 1 || guess > 100) {
                System.out.println("1から100の間で入力してください。");
            } else if (guess < numberToGuess) {
                System.out.println("もっと高い数です。");
            } else if (guess > numberToGuess) {
                System.out.println("もっと低い数です。");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("正解です！ " + numberOfTries + " 回で当たりました。");
            }
        }
        
        scanner.close();
    }
}