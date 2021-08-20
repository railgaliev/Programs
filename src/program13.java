import java.util.Scanner;

public class program13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        a=a*45+(a/2)*5+((a+1)/2-1)*15;
        System.out.print((9+a/60) + " " + a%60);
        in.close();
    }
}
