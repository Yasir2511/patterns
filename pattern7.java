import java.util.Scanner;
public class practise {

// *  *  *  *  *      
//  *  *  *  *  *     
//   *  *  *  *  *    
//    *  *  *  *  *   
//     *  *  *  *  * 

    public static void main(String[] args) {
        System.out.print("enter no :");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print("*  ");
            }
            System.out.println();
            int k=i+1,p=0;
            while (p<k) {
                System.out.print(" ");
                p++;
            }
        }
    }
}
