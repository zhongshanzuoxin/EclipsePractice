

	import java.util.Random;
import java.util.Scanner;

	public class janken {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        String[] hands = {"グー", "チョキ", "パー"};

	        System.out.println("じゃんけんゲームへようこそ！");
	        System.out.println("あなたの選択（グー、チョキ、パー）のどれかを入力してください:");
	        String player = scanner.nextLine();

	        int cpu = random.nextInt(hands.length);
	        String cpuchoice = hands[cpu];

	        System.out.println("コンピュータの選択: " + cpuchoice);
	        System.out.println("あなたの選択: " + player);

	        if (player.equals(cpuchoice)) {
	            System.out.println("引き分けです！");
	        } else if ((player.equals("グー") && cpuchoice.equals("チョキ")) ||
	                   (player.equals("チョキ") && cpuchoice.equals("パー")) ||
	                   (player.equals("パー") && cpuchoice.equals("グー"))) {
	            System.out.println("あなたの勝ちです！");
	        } else {
	            System.out.println("コンピュータの勝ちです！");
	        }

	        scanner.close();
	    }
	}
