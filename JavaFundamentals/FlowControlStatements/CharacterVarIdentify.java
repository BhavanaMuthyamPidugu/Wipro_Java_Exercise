import java.util.*;
public class CharacterVarIdentify{
    public static void main(String args[]){
        System.out.print("Enter a character variable to identify which it is : ");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        int nc=c-'0';
        if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
            System.out.println("Entered Character is Alphabet i.e. "+c);
        }else if(nc>=0&&nc<=9){
            System.out.println("Entered Character is Digit i.e. "+c);
        }else{
            System.out.println("Entered Character is Special Character i.e. "+c);
        }
        sc.close();
    }
}