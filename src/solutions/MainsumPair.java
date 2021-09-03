import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainsumPair {

    public static void main(String[] args) throws IOException
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String initials = bufferedReader.readLine();
        String[] details = initials.split(" ");
        int length = Integer.parseInt(details[0]);
        int sum = Integer.parseInt(details[1]);

        String list = bufferedReader.readLine();
        String[] array = list.split(" ");

        int count = 0;
        for(int i = 0; (i < length); i++) {
            for (int j = i+1; j < length ; j++) {
               // System.out.println("array[i]"+array[i]+"array[j]"+array[j]+"sum"+sum);

                if((Integer.parseInt(array[i])+Integer.parseInt(array[j])) == sum){
                    count = count+2;
                }
            }
        }
        System.out.println(count);
    }
}
