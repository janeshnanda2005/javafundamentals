 interface A{
     public void disp();
}

class Do implements A{
    @Override
    public void disp(){
        System.out.println("King");
    }   
}

public class Classfunc{
    public static void main (String[] args){
        Do obj = new Do();
        obj.disp();
    }
}