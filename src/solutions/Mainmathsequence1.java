package solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mainmathsequence1 {

    public static void main(String[] args) throws IOException {
        String line;
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        line = inp.readLine();

        int p = Integer.parseInt(line);


        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < p; i++) {
            int x = Integer.parseInt(inp.readLine());
            l.add(x);
        }

        int c = 0;
        int z = l.get(p - 1);
        for (int i = 0; i < p; i++) {
            int m = 0;
            if (i - 1 >= 0) {
                m = l.get(i - 1);
            }
            int n = l.get(i);
            int o = z + 1;
            if (i + 1 < p) {
                o = l.get(i + 1);
            }
            if (m < n && o > n) {
                c++;
            }
        }


        //Use the following code to print output
        if (c > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }}