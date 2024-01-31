import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        for (int num : numbers) {
            String output = "";
            if (num % 3 == 0) {
                output += "Fizz";
            }
            if (num % 5 == 0) {
                output += "Buzz";
            }
            if (output.isEmpty()) {
                output = Integer.toString(num);
            }
            System.out.println(output);
        }
    }
}
