package solutions;
import java.util.*;

public class HomeComponent {
    public static void main(String args[]) throws Exception {
        List I = new ArrayList();
        int a= (int)(3*2.5);
        for(int i=0; i<10; i++)
            I.add(i);

            String s="Hello";
            I.add(a,s.getBytes("UTF-8")[2]);
            System.out.println(I);

    }
}
