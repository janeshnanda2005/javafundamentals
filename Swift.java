import java.util.Scanner;

public class Swift {
    public static void main (String[] args){
        /*int a = 0;
        while (a < 5){
            System.out.println(a);
            a++;
        }

        int b;
        b = 0;
        while (b < 10){
            System.out.println(b);
            b++;
        }

        int c ;
        c = 0;
        do { 
            System.out.println("#");
            c++;           
        } 
        while (c < 10);*/

        /*for(int i= 1 ; i <=10;i++){
            System.out.println(i);
        }*/

        /*for(int i = 0; i < 5 ; i++){
            for(int j = 0;j < 3; j++){
                if ((i+j) == 4){
                    break;
                }
                System.out.println(i+j);
            }
        }*/

        //same can be done for conitnue

        int[] len = {23,45,67,89,43,34,43,46,78};
        Scanner my = new Scanner(System.in);
        System.err.println("Enter the number: ");
        int num = my.nextInt();
        int target = num;

        for(int i =0;i<len.length;i++){
            if (len[i] == target){
                System.out.println(target+" "+"found in"+" "+i);
                break;
            }
        }


    }

}
    
