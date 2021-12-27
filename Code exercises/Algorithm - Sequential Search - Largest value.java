import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SequentialSearch {

    // Adapted from Shaffer, C. (2011). [A Practical Introduction to Data Structures and Algorithm Analysis](https://people.cs.vt.edu/shaffer/Book/JAVA3e20130328.pdf). Blacksburg: Virginia. Tech.

    /** @return Position of largest value in array A */
    static int findLargest(int[] A) {
        int currlarge = 0;              // Holds largest element position
        for (int i=1; i<A.length; i++)  // For each element
            if (A[currlarge] < A[i])    // if A[i] is larger
                currlarge = i;          // remember its position
        return currlarge;               // Return largest position
    }

    static void searchSequence() {

        SequentialSearch ss = new SequentialSearch();
        Random random = new Random();

        // take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arrSize = Integer.parseInt(sc.nextLine());

        int[] arr = new int[arrSize];
        double scaler = 0.0000001;

        // measure runtime
        long startTime = System.currentTimeMillis();
        DecimalFormat df = new DecimalFormat("#.000");

        for (int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.abs(random.nextInt()) * scaler);
        }

        int largestPosition = ss.findLargest(arr);

        long endTime = System.currentTimeMillis();

        System.out.println("Largest index: " + largestPosition);
        System.out.println("Largest value: " + arr[ss.findLargest(arr)]);
        System.out.println("Array: " + Arrays.toString(Arrays.copyOfRange(arr, 0, 10)));
        System.out.println("Runtime: " + df.format((endTime - startTime) * 0.001) + " second(s) \n");
    }

    public static void main(String[] args) {

        for (int i=0; i < 5; i++) {
            searchSequence();
        }

    }

}


/*
Enter array size: 
10000
Largest index: 55
Largest value: 214
Array: [131, 8, 37, 181, 37, 45, 147, 3, 59, 114]
Runtime: .004 second(s) 

Enter array size: 
100000
Largest index: 381
Largest value: 214
Array: [42, 184, 104, 133, 190, 212, 37, 76, 27, 30]
Runtime: .009 second(s) 

Enter array size: 
1000000
Largest index: 244
Largest value: 214
Array: [69, 173, 12, 28, 6, 25, 163, 53, 28, 45]
Runtime: .038 second(s) 

Enter array size: 
10000000
Largest index: 122
Largest value: 214
Array: [63, 180, 85, 68, 134, 142, 63, 149, 71, 66]
Runtime: .195 second(s) 

Enter array size: 
100000000
Largest index: 521
Largest value: 214
Array: [147, 54, 177, 94, 175, 26, 135, 114, 28, 0]
Runtime: 1.773 second(s) 


Process finished with exit code 0
*/
