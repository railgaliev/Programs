/*import java.util.Scanner;

public class program18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        //System.out.print(h/(a-b)+(a-b)*(h%(a-b)));
        System.out.print(((h-h/a)/(a-b))%h+1);
        in.close();
    }
}*/
import java.util.Scanner;

public class program18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        //System.out.print(h/(a-b)+(a-b)*(h%(a-b)));
        System.out.print((h-a)/(a-b)+ (int)(((h - a) % (a - b)) / (((h - a) % (a - b)) - 0.000001))+1);
        in.close();
    }
}







