package exam_sv3_part1_potpot.algorithms;

public class Algorithms {

    public int greatestCommonDivisor(int firstNumber, int secondNumber) {
        int greaterNumber = firstNumber > secondNumber ? firstNumber : secondNumber;
        int greatestDivisor = 1;
        for (int i = 2; i <= greaterNumber/2; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                greatestDivisor = i;
            }
        }
        return greatestDivisor;
    }
}
