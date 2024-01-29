
public class practice6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int[] numbers = new int[20];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 5 * i;
		}
		
		for (int i = 0; i <= 10; i++) {
			if(numbers[i] % 2 != 0) {
				System.out.print(numbers[i] + (i < 10 ? "," : "\n"));
			}
		}
		
		for (int i = 11; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.print(numbers[i] + (i < numbers.length - 1 ? "," : ""));
			}	
		}
	}
}