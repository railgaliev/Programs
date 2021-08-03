import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Cathet a: ");
        double a = in.nextDouble();
        System.out.print("Cathet b: ");
        double b = in.nextDouble();
        System.out.print("Hypotenuse с: ");
        System.out.print("%.2f"+Math.sqrt(a*a+b*b));
        in.close();
    }
}
