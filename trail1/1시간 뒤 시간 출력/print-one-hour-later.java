import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String[] str = time.split(":");
        System.out.println((Integer.parseInt(str[0]) + 1) + ":" + str[1]);
    }
}