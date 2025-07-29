import java.util.*;
public class ColorCode{
    public static void main(String args[]){
        System.out.print("Enter a letter to get the color code of it : ");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c=='b'||c=='B'){
            System.out.println("Color is : Blue");
        }else if(c=='w'||c=='W'){
            System.out.println("Color is : White");
        }else if(c=='g'||c=='G'){
            System.out.println("Color is : Green");
        }else if(c=='r'||c=='R'){
            System.out.println("Color is : Red");
        }else if(c=='o'||c=='O'){
            System.out.println("Color is : Orange");
        }else if(c=='y'||c=='Y'){
            System.out.println("Color is : Yellow");
        }else{
            System.out.println("Invalid Color !");
        }
        sc.close();
    }
}