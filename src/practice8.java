import java.util.Scanner;

public class practice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.nextLine();
        
        int N = sc.nextInt();
        sc.nextLine(); 
        
        String menu = sc.nextLine();
        String[] words = menu.split(" ");
        
        String answer = "No";
        for (String word : words) {
            if (word.contains(S)) {
                answer = "Yes";
                break;
            }
        }
        
        System.out.println(answer);
    }
}
