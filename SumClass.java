import  java.util.Scanner;


public class SumClass {
    public static void main(String[] args) {
        // Create objects of the other classes and call their methods
        combinations on = new combinations();
        System.out.println(on.adder());
        System.out.println(on.sumoffirstnumbers());
        System.out.println(on.sum());
    }
}

class combinations {
    public int adder() {
        Scanner obj1 = new Scanner(System.in);
        System.err.print("Enter the number a:");
        int a = obj1.nextInt();

        System.err.print("Enter the number b:");
        int b = obj1.nextInt();
        return a + b;
    }

    public long sumoffirstnumbers(){
        Scanner obj2 = new Scanner(System.in);
        System.out.print("Enter the numbers to sum:");
        long c = obj2.nextInt();
        long sum = 0;
        int i = 0;
        while (i < c){
            sum+=i;
            i++;
        }
        return sum;
    }

    public long sum(){
        Scanner obj3 = new Scanner(System.in);
        System.out.print("Enter the number of times:");
        long c = obj3.nextLong();
        long sum = 0;
        System.out.println("Enter the elements:");
        for(int i = 0;i<c;i++){
            long num = obj3.nextLong();
            sum+=num;
        }
        return sum;

    }



}
