import java.util.Scanner;

public class armstrong{

    public static void main(String[] args) {
        int num = 153;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = 0;

        while(num!=0)
        {
            int rem = num%10;
            temp = temp + (rem*rem*rem);
            num = num/10;
        }

        if(temp == a)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an Armstrong number");
        }
    }
}
