import java.util.Scanner;

import static java.lang.Math.sqrt;

public class program21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        double c = sqrt((a-b)*(a-b));
        System.out.print((int)((a+b+c)/2));
        in.close();
    }
}