import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("The next number for the number " + a + " is " + (a+1));
        System.out.println("The previous number for the number " + a + " is " + (a-1));
        in.close();
    }
}
