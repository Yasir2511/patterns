
import java.util.Scanner;

//      * 
//     * *
//    * * *
//   * * * *
//  * * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *
public class practise2 {
    public static void main(String[] args) {
        int k=1,i,j;
        System.out.print("enter no :");
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();
        for( i=number;i>0;i--){
            for( j=0;j<i;j++){
                System.out.print(" ");
            }
            while(k!=(number+1)){
            prin(k);
             System.out.println("");
             break;
            }
            k++;
        }   
        for( i=0;i<number;i++){
            for( j=number-i;j>0;j--){
                System.out.print(" *");
            }
            System.out.println();
            int z=i+1,p=0;
            while (p<z) {
                System.out.print(" ");
                p++;
            }
        }
        
    }

    public static void prin(int k){
        for(int i=0;i<k;i++){
        System.out.print("* ");
        }
}

}

