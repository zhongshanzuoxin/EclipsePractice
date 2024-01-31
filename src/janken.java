

	import java.util.Random;
import java.util.Scanner;

	public class janken {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        String[] hands = {"グー", "チョキ", "パー"};

	        System.out.println("じゃんけんゲームへようこそ！");
	        System.out.println("あなたの選択（グー、チョキ、またはパー）を入力してください:");
	        String player = scanner.nextLine();

	        int コンピュータの選択インデックス = random.nextInt(hands.length);
	        String コンピュータの選択 = hands[コンピュータの選択インデックス];

	        System.out.println("コンピュータの選択: " + コンピュータの選択);
	        System.out.println("あなたの選択: " + player);

	        if (player.equals(コンピュータの選択)) {
	            System.out.println("引き分けです！");
	        } else if ((player.equals("グー") && コンピュータの選択.equals("チョキ")) ||
	                   (player.equals("チョキ") && コンピュータの選択.equals("パー")) ||
	                   (player.equals("パー") && コンピュータの選択.equals("グー"))) {
	            System.out.println("あなたの勝ちです！");
	        } else {
	            System.out.println("コンピュータの勝ちです！");
	        }

	        scanner.close();
	    }
	}
