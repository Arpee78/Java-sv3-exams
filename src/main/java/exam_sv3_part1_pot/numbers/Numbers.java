package exam_sv3_part1_pot.numbers;

import java.util.List;

public class Numbers {

    int sumOfPositiveEvenNumbers(List<Integer> numbers) {
        int sum = 0;

        for (Integer number : numbers) {
            if (number > 0 && number % 2 == 0) {
                sum += number;
            }
        }

        return sum;
    }

}
