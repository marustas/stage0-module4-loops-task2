package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void printPower(int power) {
        int counter = 1;
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int result = 1;
            System.out.println(1);
            while (counter <= power) {
                result = result * 2;
                System.out.println(result);
                counter++;
            }
        }
    }

    public static void main(String[] args) {
        printPower(0);
    }
}