package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static  void printFactorialRow(int printToInclusive) {
        int i = 0;
        int cons = 1;
        while (i <= printToInclusive){
            if (i <= 1)
                System.out.println(1);
            else {
                cons *= i;
                System.out.println(cons);
            }
            i++;
        }
    }
}

