import java.util.Scanner;

// *    
// **   
// ***  
// **** 
// *****
public class practise2 {
    public static void main(String[] args) {
        System.out.println("enter no :");
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();
        for(int i=1;i<=number;i++)
        {
            prin(i);
        }
    }

    public static void prin(int k){
        for(int i=0;i<k;i++)
        {
        System.out.print("*");
        }
        System.out.print("\n");
}
}
