import java.util.Scanner;

public class program19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int a = s % 10;
        int b = (s/10)%10;
        int c = ((s/100)%10);
        int d = s/1000;
        System.out.print((a-d)*(a-d)+(c-b)*(c-b)+1);
        in.close();
    }
}