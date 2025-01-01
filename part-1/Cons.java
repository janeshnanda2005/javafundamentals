class Simple{
    int number;
    int age;

    Simple(int number,int age){
        this.number = number;
        this.age = age;
    }


    void display(){
        System.out.println("The number is"+" "+number+" "+"aged"+" "+age);
    }
}


public class Cons {
    public static void main(String[] args) {
        Simple val = new Simple(23,45);
        val.display();
    }
    
}
