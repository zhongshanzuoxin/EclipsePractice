package practice;

public class pracrice1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
        int start = 1;
        int end = 10;
        int evenCount = 0;
        int evenSum = 0;
        
        for (int number = start; number <= end; number++) {
            if (number % 2 == 0) { // 偶数の場合
                evenCount++;      // 偶数の個数を増やす
                evenSum += number; // 偶数の合計を更新
            }
        }
        
        System.out.println("1から10までの偶数の個数: " + evenCount);
        System.out.println("1から10までの偶数の合計: " + evenSum);


	}

}
