import java.util.Scanner;

public class Main {

    private static int getMin(int a, int b, int c) {
        int min1 = a < b ? a : b;
        return min1 < c ? min1 : c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        System.out.println(getMin(a, b, c));
    }
}