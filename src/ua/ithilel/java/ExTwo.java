package ua.ithilel.java;

public class ExTwo {
    public static void main(String[] args) {

        int sum = 1;
        for (int i = 1; i <= 101; i++) {
            sum *= i;
            if (sum >= 1000) {
                System.out.println(sum);
                return;
            }
        }
    }
}
