package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int count = 0;
        while (count <= printToInclusive) {
            if (count != 2 && count % 2 == 0 || count % 3 == 0 || count % 4 == 0 || count % 5 == 0) {
                count++;
            } else {
                System.out.println(count);
                count++;
            }
        }
    }
}
