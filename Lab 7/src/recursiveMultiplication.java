public class recursiveMultiplication {

    /**
     * Recursive method for multiplication using subtraction
     * @param n first num
     * @param m second num
     * @return recursive step for calculating product of n and m
     */
    private static int multiply(int n, int m){
        if (n == 0 || m == 0){
            return 0;
        } else {
            return n + multiply(n, m - 1);
        }
    }

    /**
     * Recursive method for calculating n-th term of fibonacci sequence using subtraction
     * @param fibInp n-th term position
     * @return recursive step for calculating fibonacci number
     */
    private static int fib(int fibInp){
        if (fibInp < 2) {
            return fibInp;
        } else {
            return fib(fibInp - 1) + fib(fibInp - 2);
        }
    }

    public static void main (String[] args){
        int multiCal = multiply(3, 3);
        System.out.println(multiCal);
        int fibCal = fib(3);
        System.out.println(fibCal);
    }
}
