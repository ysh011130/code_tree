import java.util.Scanner;
public class Main {

    private static boolean isMultipleOfThree(int n) {
        return n % 3 == 0;
    }

    private static boolean has369Digit(int n) {
        String number = String.valueOf(n);
        return number.contains("3") || number.contains("6") || number.contains("9");
    }

    private static int countTargetNumbers(int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (isMultipleOfThree(i) || has369Digit(i)) {
                cnt++;
            }

        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        System.out.println(countTargetNumbers(A, B));
    }
}