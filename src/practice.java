import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.print("カラオケの料金は30分いくらにしますか？ 31分で60分の料金とします");
		int price = scan.nextInt();
		System.out.print("何分滞在しますか？");
		int time = scan.nextInt();
		double totalprice = time / 30.0;
		
		System.out.println("支払い料金は" + (int)(Math.ceil(totalprice)) * price + "円です");

	}

}
