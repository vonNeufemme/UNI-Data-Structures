import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class SequentialSearch {

    // Adapted from Shaffer, C. (2011). [A Practical Introduction to Data Structures and Algorithm Analysis](https://people.cs.vt.edu/shaffer/Book/JAVA3e20130328.pdf). Blacksburg: Virginia. Tech.

    public static int largestPosition;
    public static int[] arr;

    public static long startTime;
    public static long endTime;

    /** @return Position of largest value in array A */
    public static int findLargest(int[] A) {
        int currlarge = 0;              // Holds largest element position
        for (int i=1; i<A.length; i++)  // For each element
            if (A[currlarge] < A[i])    // if A[i] is larger
                currlarge = i;          // remember its position
        return currlarge;               // Return largest position
    }

    public static void searchSequence() {

        Random random = new Random();
        SequentialSearch ss = new SequentialSearch();

        /* take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arrSize = Integer.parseInt(sc.nextLine()); */

        arr = new int[SequentialSearchGUI.input];
        double scaler = 0.0000001;

        // measure runtime
        startTime = System.currentTimeMillis();
        DecimalFormat df = new DecimalFormat("#.000");

        for (int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.abs(random.nextInt()) * scaler);
        }

        largestPosition = ss.findLargest(arr);

        endTime = System.currentTimeMillis();

        System.out.println("Input size: " + SequentialSearchGUI.input);
        System.out.println("Largest index: " + largestPosition);
        System.out.println("Largest value: " + arr[ss.findLargest(arr)]);
        System.out.println("Array: " + Arrays.toString(Arrays.copyOfRange(arr, 0, 10)));
        System.out.println("Runtime: " + df.format((endTime - startTime) * 0.001) + " second(s) \n");

    }

}
