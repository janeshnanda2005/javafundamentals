import java.util.Scanner;

public class Swift {
    public static void main (String[] args){
        int[] len = {23,45,67,89,43,34,43,46,78};
        Scanner my = new Scanner(System.in);
        System.out.println("Enter the number: ");
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
    
