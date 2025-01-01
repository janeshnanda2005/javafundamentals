import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class filewriter{
    public static void main(String[] args) throws IOException {

        FileInputStream n = new FileInputStream("text.txt");
        BufferedInputStream obj = new BufferedInputStream(n);
        int i;
        while((i = obj.read())!=1){
            System.out.println((char)i);
        }
        obj.close();
        n.close();


    
    }
}
