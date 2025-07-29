import java.util.*;
public class LastDigitCheck{
    public static void main(String args[]){
        System.out.print("Enter Two numbers to check whether they have same last digit : ");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int r1=n1%10;
        int r2=n2%10;
        if(r1==r2){
            System.out.println("Same i.e. "+r1);
        }else{
            System.out.println("Different i.e. "+r1+" and "+r2);
        }
        sc.close();
    }
}