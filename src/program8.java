import java.util.Scanner;


public class program8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int s=0;
        while (a>0){
            s=s+a%10;
            a=(a-a%10)/10;

        }
        System.out.print(s);
        in.close();
    }
}
