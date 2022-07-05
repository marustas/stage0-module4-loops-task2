package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        double i = 0;
        if (power >= 0) {
            while (i < power) {
                double result = Math.pow(i, 2);
                System.out.println(result);
                i++;
            }
        } else {
            System.out.println("too much power");
        }
    }
}
