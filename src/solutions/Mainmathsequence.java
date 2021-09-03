import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainmathsequence {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String nums = bufferedReader.readLine();
        int n = Integer.parseInt(nums);
       String ainput = bufferedReader.readLine();
        String[] astr = ainput.split(" ");
        int[] arr= new int[n];
        for (int i = 0; i < n; i++){
            arr[i]=Integer.parseInt(astr[i]);
        }
            System.out.println(zzis(arr, n));

    }

   static int zzis(int arr[], int n)
    {
        int[][] las = new int[n][2];

        for (int i = 0; i < n; i++)
            las[i][0] = las[i][1] = 1;
        int res = 1;
        for (int i = 1; i < n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (arr[j] < arr[i] && las[i][0] < las[j][1] + 1)
                    las[i][0] = las[j][1] + 1;

                if( arr[j] > arr[i] && las[i][1] < las[j][0] + 1)
                    las[i][1] = las[j][0] + 1;
            }

            if (res < max(las[i][0], las[i][1]))
                res = max(las[i][0], las[i][1]);
        }

        return res;
    }

   static int max(int a, int b) {  return (a > b) ? a : b; }

}