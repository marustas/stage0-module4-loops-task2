package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power >= 0) {
            int e;
            int result;
            for (int i = 0; i < power; i++) {
                result = 1;
                e = i;
                while (e > 0) {
                    result *= 2;
                    e--;
                }
                System.out.println(result);
            }
        } else {
            System.out.println("too much power");
        }
    }
}
