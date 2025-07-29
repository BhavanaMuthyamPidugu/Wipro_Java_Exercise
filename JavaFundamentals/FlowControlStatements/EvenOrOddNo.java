import java.util.*;
public class EvenOrOddNo{
    public static void main(String args[]){
        System.out.print("Enter a Number to check whether it's ODD or EVEN : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("Given Number "+n+" is EVEN");
        }else{
            System.out.println("Given Number "+n+" is ODD");
        }
        sc.close();
    }
}