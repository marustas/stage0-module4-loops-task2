package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void printFactorialRow(int printToInclusive) {
        int count = 0;
        int factorial = 1;
        while (count <= printToInclusive) {
            if (count <= 1)
                System.out.println(1);
            else {
                factorial *= count;
                System.out.println(factorial);
            }
            count++;
        }
    }
}

