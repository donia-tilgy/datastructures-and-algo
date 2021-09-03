
package solutions;

import java.io.*;
public class Power
{
  public static void main (String[] args) throws java.lang.Exception
  {

    //use the following code to fetch input from console
    String line;


    BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
    line=inp.readLine();
    if(Integer.parseInt(line)<= Math.pow(10,5)){
      String[] arra = inp.readLine().split(" ");

      int count =0;
      for(int i=0;i<arra.length;i++){
        for(int j= i + 1;j<arra.length;j++){
          float a = new Float(arra[i]);
          float b = new Float(arra[j]);

          if(i >= 0 && j > 0 && i < j && ((a*b) >= (a+b))){
            count++;
          }
        }
      }

      //Use the following code to print output
      System.out.println(count);
    }
  }
}


