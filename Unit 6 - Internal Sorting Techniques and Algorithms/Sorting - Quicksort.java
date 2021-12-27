package quicksort;
import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {

    int count = 0;
    int left = 0;
    int right = 0;

    public ArrayList<Integer> quicksort(ArrayList<Integer> sequence) {

        Integer pivot;
        int size = sequence.size();
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();

        if (size <= 1) {
            System.out.println(sequence);
            return sequence;
        } else {
            pivot = sequence.get(sequence.size() - 1);
            sequence.remove(pivot);
            System.out.println("pivot: " + pivot);
        }

        for (Integer item: sequence) {
            if (item > pivot) {
                right.add(item);
                this.right += 1;
            } else {
                left.add(item);
                this.left += 1;
            }
        }

        System.out.println(left + " - pivot [" + pivot + "] - " + right);

        ArrayList<Integer> branch = new ArrayList<>(quicksort(left));
        branch.add(pivot);
        branch.addAll(quicksort(right));
        System.out.println("branch: " + branch);
        this.count += 1;
        return branch;
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        ArrayList<Integer> sequence = new ArrayList<>(Arrays.asList(12, 9, 4, 99, 120, 1, 3, 10, 23, 45, 75,
                                                                    69, 31, 88, 101, 14, 29, 91, 2, 0, 77));
        qs.quicksort(sequence);
        System.out.println("Your sequence has been sorted in: " + qs.count + " quicksorts.");
        System.out.println("The elements have been moved to the left of the pivot: " + qs.left + " times.");
        System.out.println("The elements have been moved to the right of the pivot: " + qs.right + " times.");
    }
}
