package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int mult = 0;
        int count =0;
        while (count <= multiplyByAndToInclusive) {
            mult=count*multiplyByAndToInclusive;
            System.out.println(mult);
            count++;
        }
    }
}
