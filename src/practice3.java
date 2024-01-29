import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		int[] scores = {70, 80, 90, 60};
//		for(int i = 0; i < 3; i++) {
//			System.out.print(scores[i]);
//		}
//		for (int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i]);
//		}
//		for(int score: scores) {
//			System.out.println(score);
//		}
        String password;
		do {
			password = new Scanner(System.in).next();
		} while (password.equals("d0t1nsta11") == false);
		System.out.println("password matched");
		
//		for(int i = 1; i < 11; i++) {
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
//		}

	}

}
