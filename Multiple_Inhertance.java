class A{
    void dis(){
        System.out.println("erftgyhu");
    }
}

class B extends A{
    void disb(){
        System.out.println("erftgyhub");
    }
}

public class Multiple_Inhertance extends B {

    public static void main(String[] args) {
        B obj = new B();
        obj.disb();
        obj.dis();
    }
    
}
