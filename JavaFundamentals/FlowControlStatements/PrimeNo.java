import java.util.*;
public class PrimeNo{
    public static void main(String args[]){
        System.out.print("Enter a number to check if it's prime or not : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=true;
        for(int i=2;i<=n/2+1;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag==true){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }
        sc.close();
    }
}