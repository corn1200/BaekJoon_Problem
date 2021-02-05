package ProblemFunction;

public class SumOfIntegers {
    public static void main(String[] args) {

    }

    public static long sum(int[] a) {
        long total = 0;
        for (int n : a) {
            total += n;
        }
        return total;
    }
}
