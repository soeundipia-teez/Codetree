import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum = A + B;
        double avr = (double)sum / 2;

        System.out.print(sum + " ");
        System.out.printf("%.1f", avr);
    }
}