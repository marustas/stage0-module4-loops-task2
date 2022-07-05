package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        int temp = 0;
        if (multiplyByAndToInclusive < 0) {
            temp = -1 * multiplyByAndToInclusive;
        } else {
            temp = multiplyByAndToInclusive;
        }
        if (multiplyByAndToInclusive != 0) {
            while (counter <= temp) {
                System.out.println(counter * multiplyByAndToInclusive);
                counter++;
            }
        }
    }
}