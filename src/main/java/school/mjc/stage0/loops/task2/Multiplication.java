package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int mult = 0;
        while (mult <= multiplyByAndToInclusive) {
            System.out.println(mult * multiplyByAndToInclusive);
            mult++;
        }
    }
}
