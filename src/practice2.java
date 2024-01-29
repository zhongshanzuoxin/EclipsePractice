import java.util.Scanner;
public class practice2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("色は？");
		String signal = new Scanner(System.in).next();
		switch (signal) {
		case "red":
			System.out.println("とまれ");
			break;
		case "yellow":
			System.out.print("減速して");
			break;
		case "blue":
		case "greeen":
			System.out.print("進んでよし");
			break;
			default:
				System.out.println("故障中");
		}

	}

}
