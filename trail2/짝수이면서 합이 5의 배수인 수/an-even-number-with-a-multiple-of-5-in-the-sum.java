import java.util.Scanner;
public class Main {

    private static String getResult(int n) {
        int tens = n / 10;
        int ones = n % 10;
        return n % 2 == 0 && (tens + ones) % 5 == 0 ? "Yes" : "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(getResult(n));
    }
}