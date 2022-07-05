package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int count = 1;
        while (count <= printToInclusive) {
            if (count == 2 || count == 3 || count == 5 || count == 7) {
                System.out.println(count);
                count++;
            } else if (count % 2 == 0 || count % 3 == 0 || count % 4 == 0 || count % 5 == 0) {
                count++;
            } else {
                System.out.println(count);
                count++;
            }
        }
    }
}
