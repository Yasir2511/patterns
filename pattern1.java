import java.util.Scanner;
//     *
//    **
//   ***
//  ****
// *****

public class practise {
    public static void main(String[] args) {
        int k=1;
        System.out.println("enter no :");
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();
        for(int i=number;i>1;i--)
        {
            for(int j=0;j<i-1;j++)
            {
                 System.out.print(" ");
            }
            while(k<=number)
             {
                prin(k);
                 System.out.print("\n");
                 k++;
                 break;
             }
        }
        prin(number);
        // System.out.println("NO is:"+result);
    }

    public static void prin(int k){
        for(int i=0;i<k;i++)
        {
        System.out.print("*");
        }
}
}
