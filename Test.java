public class Test{
    public static void main(String[] args) {
        int a = -2;
        if (a > 18){
            System.out.println("You are eligible to vote");
        }
        else if (a < 0){
            System.out.println("You are not born yet");
        }
        else{
            System.out.println("you are not eligible");
        }
    }

}