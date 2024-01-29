
public class practice4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] scores = {100, -46, 85, 67};
		for (int score: scores) {
			if(score < 0) {
				//break;
				continue;
			}
			System.out.println(score);
		}
		System.out.println("終わりです");
		
		
		

	}

}
