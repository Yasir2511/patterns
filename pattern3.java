import java.util.Scanner;

//     *
//    * *
//   * * *
//  * * * *
// * * * * *
public class practise2 {
    public static void main(String[] args) {
        int k=1;
        System.out.print("enter no :");
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();
        for(int i=number;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            while(k!=(number+1)){
            prin(k);
             System.out.println("");
             break;
            }
            k++;
        }   
        
    }

    public static void prin(int k){
        for(int i=0;i<k;i++){
        System.out.print("* ");
        }
}
}

