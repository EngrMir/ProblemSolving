//InterviewProblem2

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class InterviewProblem2 {

    
    public static void main(String args[])
    {
        int [] testArray = new int[4];
        System.out.println(solution(testArray));
    }


    public static int solution(int[] A) {
        // write your code in Java SE 8
        
        double binarian = 0;
        
        for (int i = 0; i < A.length; i++) {
            binarian = binarian + Math.pow(2, A[i]);
        }
        int tempBinarian = (int) binarian;
        int binaryArray[] = new int[30];
        int i = 0;
        while (tempBinarian > 0) {
    
            binaryArray[i++] = tempBinarian % 2;
            tempBinarian = tempBinarian / 2;
        }
        int sum = 0;
        List<Integer> list = new ArrayList<Integer>();
        do {
            for (int j = i - 1; j >= 0; j--) {
                if (binaryArray[j] == 0) {
                    i--;
                    continue;
                }
                sum = sum + (binaryArray[j] * (int) Math.pow(2, i));
                i--;
                list.add(i);
            }
        } while (i > 0);
        
        return list.size();
    
    }
}
