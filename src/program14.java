import java.util.Scanner;


public class program14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        System.out.print((a*n+(b*n)/100) + " " + ((b*n)%100));
        in.close();
    }
}

