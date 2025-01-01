class Gen<T>{
    T obj;
    Gen(T n){
        obj = n;
    }

    T display(){
        return obj;
    }
}

public class Generics {
    public static void main(String[] args) {
        Gen<Integer> o  = new Gen<>(5678);
        System.out.println(o.display());

        Double[] val = {57678.4,3456.4};
        Gen<Double>op = new Gen<>(val);
        op.display();
    }
}
