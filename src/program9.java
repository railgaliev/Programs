import java.util.Scanner;


public class program9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print(a+(2-a%2));
        in.close();
    }
}
