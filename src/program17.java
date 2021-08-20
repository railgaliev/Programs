import java.util.Scanner;

public class program17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.print((n-m%n)%n);
        //System.out.print(n-(m-(m/n)*n));
        in.close();
    }
}
