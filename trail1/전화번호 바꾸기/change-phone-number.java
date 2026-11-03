import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String phoneNumber = sc.next();
        String[] parts = phoneNumber.split("-");
        String first = parts[0];
        String middle = parts[1];
        String last = parts[2];
        System.out.println(first + "-" + last + "-" + middle);
    }
}