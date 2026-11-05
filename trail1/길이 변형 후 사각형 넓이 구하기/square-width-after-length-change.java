import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int afterX = x + 8;
        int afterY = y * 3;
        System.out.println(afterX);
        System.out.println(afterY);
        System.out.println(afterX * afterY);
    }
}