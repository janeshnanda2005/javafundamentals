public class Main {
    static void mymain(String x){
        System.out.println("Hello "+x);
    }

    static void Agechecker(int age){
        if (age > 18){
            System.out.println("You are eligible");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
    }
    public static void main(String[] args) {
        mymain("Janesh");
        int y = 77;
        Agechecker(45);
        Agechecker(y);
        
    }   
}
