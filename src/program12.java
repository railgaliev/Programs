import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int s=a;
        a=b;
        b=s;
        System.out.print(a + " " + b);
        in.close();
    }
}
