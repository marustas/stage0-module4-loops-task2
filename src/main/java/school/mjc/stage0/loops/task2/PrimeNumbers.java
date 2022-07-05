package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int firstCount = 2;
        while (firstCount <= printToInclusive) {
            int num = firstCount;
            int i = 2;
            int count = 0;
            while (i < num) {
                if (num % i == 0) {
                    count++;
                    i = num + 2;
                }
                i++;
            }
            if (count == 0) {
                System.out.println(num);
            }
            firstCount++;
        }
    }
}