import java.util.Scanner;
public class practice1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("点数は？");
		int score = new Scanner(System.in).nextInt();
		if (score >= 90) {
			System.out.println("A判定です!");
		} else if (score >= 70) {
			System.out.println("B判定です!");
		} else {
			System.out.println("C判定です！、もっと頑張りましょう");
		}
		

	}

}
