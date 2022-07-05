package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 1;
        long factorials = 1;

        while (counter <= printToInclusive)
            factorials *= counter;
        System.out.println(factorials);
        counter++;
    }
}

