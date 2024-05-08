
import java.util.Scanner;
public class practise2 {
    // *****
    //  ****
    //   ***
    //    **
    //     *
   public static void main(String[] args) {
        System.out.println("enter no :");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int k=1;
        for(int i=0;i<num;i++){
            for(int j=num-i;j>0;j--){
                System.out.print("*");
            }
            prin(k);
            k++;
        }
        }
    public static void prin(int k){
          System.out.println();
          int i=0;
        while(i<k){
       System.out.print(" ");
       i++;
      }    
        //  return 0;
        }
}
