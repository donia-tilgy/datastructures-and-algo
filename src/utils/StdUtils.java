package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StdUtils {

    public static String[] readAllStrings() throws IOException {
        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
        int cnt = Integer.parseInt(inp.readLine());
        String[] stringArray = new String[cnt];
        for (int i=0;i<cnt;i++) {
            stringArray[i] = inp.readLine();
        }
        return stringArray;
    }


    // print array to standard output
    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
