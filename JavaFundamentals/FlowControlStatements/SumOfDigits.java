import java.util.*;
public class SumOfDigits{
    public static void main(String args[]){
        System.out.print("Enter number to get its sum of digits : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n,sum=0;
        while(n1>0){
            sum+=(n1%10);
            n1/=10;
        }
        System.out.println("The sum of the digits of given number "+n+" is = "+sum);
        sc.close();
    }
}