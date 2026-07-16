import java.util.Scanner;

public class Addmatrics
{
    public static void main(String[] args)
    {
        int [][] arr = new int [3][3];
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter the 9 numbers");

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++ )
            {
                arr[i][j] = sc.nextInt();
                sum = sum + arr[i][j];
            
            }
    }
        System.out.println("Matrics");
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++ )
            {
                System.out.print(arr[i][j] + " ");
            
            }
            System.out.println();

    }
        System.out.println("Sum of matrix elements: " + sum);
}
}