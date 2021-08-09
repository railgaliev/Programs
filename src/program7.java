import java.util.Scanner;


public class program7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print(((a-(a%10))/10)%10);
        in.close();
    }
}
