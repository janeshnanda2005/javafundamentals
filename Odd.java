import java.util.*;
public class Odd {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int num = obj.nextInt();

        if (num%2==0){
            System.out.println(num+""+"Is even");
        }
        else{
            System.out.println(num+""+"Is odd");
        }
    }
}
