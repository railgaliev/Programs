import java.util.Scanner;

public class program20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.print((m%n)*(n%m)+1);
        in.close();
    }
}