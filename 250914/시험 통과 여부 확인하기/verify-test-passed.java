import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N >= 80) {
            System.out.println("pass");
        } else {
            int x = 80 - N;
            System.out.println(x + " more score");
        }
    }
}