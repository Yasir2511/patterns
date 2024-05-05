
import java.util.Scanner;
public class practise {
 // *****
 // ****
 // ***
 // **
 // *
    public static void main(String[] args) {
        System.out.println("enter no :");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        for(int i=0;i<num;i++){
            System.out.println();
            for(int j=num-i;j>0;j--){
                System.out.print("*");
            }
        }
    }
}
