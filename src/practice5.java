import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int score = new Scanner(System.in).nextInt();
		String result = score >= 90 ? "A!" : "B!";
		System.out.println(result);
		
		
		System.out.print("英語は？");
		int english = new Scanner(System.in).nextInt();
		System.out.print("数学は？");
		int math = new Scanner(System.in).nextInt();
//		if(english >= 80 && math >= 80) {
		if(!(english >= 80 && math >= 80)) {
			System.out.println("A!");
		} else {
			System.out.println("B!");
		}

	}

}
