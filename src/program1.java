import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Cathet a: ");
        int a = in.nextInt();
        System.out.print("Cathet b: ");
        int b = in.nextInt();
        System.out.print("Hypotenuse с: ");
        System.out.printf("%.2f", Math.sqrt(a*a+b*b));
        in.close();
    }
}
