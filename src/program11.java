import java.util.Scanner;


public class program11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        n=n%86400;
        int s = n % 60;
        int m = (n / 60)% 60;
        int ch = (n / 60)/60;
        System.out.print(ch + ":" + m/10 + m%10 +":" + s/10 + s%10);
        in.close();

    }
}