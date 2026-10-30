import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        String[] str = id.split("-");
        System.out.println(str[0] + str[1]);
    }
}