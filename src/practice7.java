
public class practice7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.print(i);
			}
		}
		
		int count = 0;
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				count++;
				sum += i;
				
			}
		}
		System.out.println("の合計は " + sum);
		System.out.println("偶数の数は " + count);
		
		for(int i = 1; i <= 10; i++) {
			if(i < 10) {
				System.out.printf("%d,", i);
			} else {
				System.out.printf("%d", i);
			}
		}
		System.out.println();
		
		int[] numbers = new int[20];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i * 5;
		}
		
		for(int i = 0; i <= 10; i++) {
				if(numbers[i] % 2 != 0) {
					System.out.print(numbers[i]);
					if(i < 9) {
						System.out.print(",");
					} else {
						System.out.println();
					}
				}
		}
		
		for(int i = 0; i <= 10; i++) {
			if(numbers[i] % 2 == 0) {
				System.out.print(numbers[i]);
				if(i < 9) {
					System.out.print(",");
				} else {
					System.out.println();
				}
			}
		}
	}

}
