/**public class SimpleExce {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            System.out.println(a/b);
            
        } catch (ArithmeticException e) {
            System.out.println("Error caught");
        }
    }
    
}*/


/*public class SimpleExce {
    public static void main(String[] args) {
        try {
            age(10);
        } catch (Exception e) {
            System.out.println(e.getMessage()+" "+"Caught");
        }
        finally{
            System.out.println("The data is processed");
        }

    }

        static void age(int num) throws Exception{
        if(num<18){
            throw new Exception("Invalid age please try again");
        }
        else{
            System.out.println("You are eligible for the process");
        }
    }
}*/


class MyException extends Exception{

    public MyException(String val) {
        super(val);
    }

}

public  class SimpleExce{

    public static void main(String[] args) {
        try {
            int a = -10;
            if (a<0){
                throw new MyException("Sorry value is  below par level");
            }
        } catch (MyException e) {
            System.err.println("Excecuted"+" "+e.getMessage());
        }
        finally{
            System.out.println("Exited...");
        }
    }
    
}