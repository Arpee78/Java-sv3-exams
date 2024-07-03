package exam_sv2_part1_pot.sumofdigits;

public class SumOfDigits {

    public int getSumOfDigits(int number) {

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
