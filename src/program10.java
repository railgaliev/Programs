import java.util.Scanner;


public class program10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b=a/60;
        if (b<24)
        {
            System.out.print(b + " " + (a-b*60));
        }
        else
            System.out.print(b%24 + " " + (a-b*60));
        in.close();
    }
}

