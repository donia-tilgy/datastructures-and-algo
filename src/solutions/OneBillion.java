package solutions;

import java.io.*;
public class OneBillion {
    public static void main(String[] args) throws java.lang.Exception {

        //use the following code to fetch input from console
        String line;


        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        line = inp.readLine();
        class Solution {
            public int solution(int[] A, int[] B) {
                // a == 0    => b == 0
                // 0 < a < 1 => no b
                // a == 1    => no b
                // 1 < a     => b >= a / (a - 1)

                if (A.length < 2) {
                    return 0;
                }

                int result = 0;
                int currentIndex = 0;
                int maxIndex = A.length - 1;

                final int OneMillion = 1000000;
                final int OneBillion = 1000000000;

                // Counting zeros
                while (currentIndex < A.length && A[currentIndex] == 0 && B[currentIndex] == 0) {
                    currentIndex++;
                }

                // Adding number of pairs of zeros
                if (currentIndex > 1) {
                    // n = currentIndex - 1
                    // sum(1..n) => (n + 1) * (int)(n / 2) + (n % 2) * (int)((n + 1) / 2)

                    Double n = new Double(currentIndex - 1);
                    Double numberOfPairsOfZeros = (n + 1) * (int) (n / 2) + (n % 2) * (int) ((n + 1) / 2);

                    result += (numberOfPairsOfZeros > OneBillion ? OneBillion :
                            Integer.valueOf(numberOfPairsOfZeros.toString()));

                    if (result >= OneBillion) {
                        return OneBillion;
                    }
                }

                if (currentIndex == A.length) {
                    return result;
                }

                // Skip values where 0 < A.B <= 1.001000
                // 1.001000 can be in pair with numbers >= 1001.000000 but the maximum number is 1000.999999;
                // 1.001001 can be in pair with numbers >= 1000.000999;
                while
                (
                        currentIndex < A.length
                                &&
                                (
                                        A[currentIndex] == 0
                                                ||
                                                (
                                                        A[currentIndex] == 1
                                                                && B[currentIndex] < 1001
                                                )
                                )
                ) {
                    currentIndex++;
                }

                if (currentIndex == A.length) {
                    return result;
                }

                // From this point 1 < A.B, so we look for A2.B2 values where A2.B2 >= A.B / (A.B - 1)
                for (int i = currentIndex; i < A.length - 1; i++) {
                    // number between 1.001001 and 2 should be searched only
                    if (A[i] == 1) {
                        // Search numbers greater than or equals to A.B / (A.B - 1)
                        // A.B / (A.B - 1) = 1.B / (1.B - 1) = 1.B / 0.B = 1 / 0.B + 1
                        double scaledOnePerBFractionalPart = (double) OneMillion / (double) B[i] * (double) OneMillion;
                        int scaledMinValue =
                                (int) scaledOnePerBFractionalPart + OneMillion + (Math.ceil(scaledOnePerBFractionalPart) == scaledOnePerBFractionalPart ? 0 : 1);

                        while (maxIndex > i && OneMillion * A[maxIndex] + B[maxIndex] >= scaledMinValue) {
                            maxIndex--;
                        }

                        result += A.length - 1 - maxIndex;
                    } else {
                        // In this case the number is greater than or equal to 2.
                        // So we just add the remaining indexes as number of pairs.
                        result += A.length - 1 - i;
                    }

                    if (result >= OneBillion) {
                        return OneBillion;
                    }
                }

                return result >= OneBillion ? OneBillion : result;
            }
        }
    }
}