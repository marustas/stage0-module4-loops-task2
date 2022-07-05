package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int result = 0;
        int count = 0;
        if (multiplyByAndToInclusive > 0) {
            while (count <= multiplyByAndToInclusive) {
                result = count * multiplyByAndToInclusive;
                System.out.println(result);
                count++;
            }
        } else if (multiplyByAndToInclusive < 0) {
            while (count >= multiplyByAndToInclusive) {
                result = -1*count * multiplyByAndToInclusive;
                System.out.println(result);
                count--;
            }
        } else {
            System.out.print("");
        }
    }
}

