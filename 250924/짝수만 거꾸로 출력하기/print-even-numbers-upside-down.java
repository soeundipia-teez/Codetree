import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = N - 1; i >= 0; i--) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i] + " ");
            }
        }
    }
}