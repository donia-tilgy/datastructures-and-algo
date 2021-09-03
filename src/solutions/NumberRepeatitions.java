package solutions;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.*/
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
/**/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class NumberRepeatitions {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
         */
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());                // Reading input from STDIN
        String[] input = br.readLine().split(" ");
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<count && i< input.length ;i++){
            Integer num = Integer.parseInt(input[i]);
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }


      //  System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        /*//Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        /**/

        // Write your code here

    }
}
