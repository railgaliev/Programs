import java.util.Scanner;

public class program16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        //System.out.print(m/n+(m-n)/(m%n));
        System.out.print((m-1)/n+1);
        in.close();
    }
}
