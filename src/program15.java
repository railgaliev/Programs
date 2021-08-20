import java.util.Scanner;


public class program15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int n1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int n2 = in.nextInt();
        System.out.print((a2*60*60-a1*60*60)+(b2*60-b1*60)+(n2-n1));
        in.close();
    }
}