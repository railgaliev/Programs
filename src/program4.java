import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int t = in.nextInt();
        if (v>=0) {
            System.out.print(v * t % 109);
        }
        else if ((v<0)&&(t%109!=0)){
            System.out.print(109-((-1)*v * t)% 109);
        }
        else
        {
            System.out.print(0);
        }
        in.close();
    }
}