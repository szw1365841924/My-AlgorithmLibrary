package arithmetic;

public class Math {

    /**
     * 辗转相除法, 求最大公约数
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
