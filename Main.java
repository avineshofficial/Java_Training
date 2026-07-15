import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a value:");
        int a = sc.nextInt();
        System.out.print("\nEnter the b value:");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a-value :" + a);
        System.out.println("b-value :" +b);
        sc.close();
    }
}

