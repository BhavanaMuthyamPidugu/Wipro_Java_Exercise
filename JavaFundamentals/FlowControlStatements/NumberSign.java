import java.util.*;
public class NumberSign{
    public static void main(String args[]){
        System.out.print("Enter number to check sign of it : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            System.out.println("Positive");
        }else if(n==0){
            System.out.println("Zero");
        }else{
            System.out.println("Negative");
        }sc.close();
    }
}