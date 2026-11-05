import java.util.*;
public class Tester {
    

    /* Fix mergeSort
    static void MERGESORT(int[] A, int p, int q, int r) {

        if (p < r) {
            q = (int) Math.floor((p + r) / 2);
        }
    }
    
    static void MERGE2(int[] A, int p, int q, int r) {
        int[] B = new int[r - p];
        int i = p;
        int j = q + 1;
        int z = 0;
        while (i < q && j < r) {
            if (B[i] < B[j]) {
                A[z] = B[i];
                i++;
            }
            else {
                A[z] = B[j];
                j++;
            }
            z++;
        }

        if (i < q) {
            for ( ; i < q; i++, z++) {
                B[Z]
            }
        }
    }
    */

   // Median of Medians
   static int MoM(ArrayList<Integer> A, int k) {
        int subgroups = (int) Math.ceil(A.size() / 5);
        for (int i = 0; i < A.size() / 5; i++) {
            QUICKSORT(A, i*subgroups, i*subgroups*2);
        }

        return 0;
   }

   static void QUICKSORT(ArrayList<Integer> A, int low, int high) {
        if (low < high) {
            int pivot = PARTITION2(A, low, high); // This pivot is an INDEX
            QUICKSORT(A, low, pivot-1);
            QUICKSORT(A, pivot+1, high);
        }
    }

    // Implementation of PARTITION2 according to class
    static int PARTITION2(ArrayList<Integer> A, int p, int r) {
        int pivot = A.get(r); // This pivot is an INTEGER
        int low = p;
        int high = r; // Has to remain r, not r-1, otherwise 3 element arrays get messed up

        while (true) { 
            while (low < high) {
                if (A.get(low) > pivot) {
                    break;
                }
                else {
                    low++;
                }
            }
            while (high > low) {
                if (A.get(high) < pivot) {
                    break;
                }
                else {
                    high--;
                }
            }
            if (low < high) {
                int temp = A.get(low);
                A.set(low, A.get(high));
                A.set(high, temp);
                // String result = "[";
                // for (int i = p; i <= r; i++) {
                //     result += A.get(i) + " ";
                // }
                // result += "]";
                // System.out.println("Swap In-Progress contents of nums:  " + result);
            }
            else {
                int temp = A.get(high);
                A.set(high, A.get(r));
                A.set(r, temp);
                // String result = "[";
                // for (int i = p; i <= r; i++) {
                //     result += A.get(i) + " ";
                // }
                // result += "]";
                // System.out.println("PSwap In-Progress contents of nums: " + result);
                return high;
            }
        }
    }

    // Implementation of PARTITION on the web
    static int PARTITION(ArrayList<Integer> A, int low, int high) {
        int pivot = A.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (A.get(j) <= pivot) {
                i++;

                int temp = A.get(i);
                A.set(i, A.get(j));
                A.set(j, temp);
            }  
        }

        int temp = A.get(i + 1);
        A.set(i + 1, A.get(high));
        A.set(high, temp);

        return i + 1;

    }

    // Homework 2 implementation of QUICKSORT3
    static void QUICKSORT3(ArrayList<Integer> A, int p, int r) {
        if (p < r) {
            int[] pivots = PARTITION3(A, p, r);
            int pivot1 = pivots[0];
            int pivot2 = pivots[1];

            QUICKSORT3(A, p, pivot1-1);
            QUICKSORT3(A, pivot1+1, pivot2-1);
            QUICKSORT3(A, pivot2+1, r);
        }
    }

    // Homework 2 implementation of PARTITION3
    static int[] PARTITION3(ArrayList<Integer> A, int p, int r) {
        
        // Handling the unassumed case where pivot1 is greater than pivot2: swapping the two pivots so p1 <= p2
        if (A.get(p) > A.get(r)) {
            int temp = A.get(p);
            A.set(p, A.get(r));
            A.set(r, temp);
        }

        int[] pivots = new int[2];
        pivots[0] = A.get(p); // 1st pivot is 1st element in range
        pivots[1] = A.get(r); // 2nd pivot is last element in range
        System.out.println("Pivots: " + pivots[0] + " " + pivots[1]);

        
        /* Pseudocode for partition3
        low = p + 1
        high = r - 1
        while low < r
            if A[low] < pivot1
                

        while high 
            

        Cases:
        1: A[i] is less than both A[pivot1] and A[pivot2]
            Move left of pivot1
        2: A[i] is greater than A[pivot1] but less than A[pivot2]
            Move between pivot1 and pivot2
        3: A[i] is greater than both A[pivot1] and A[pivot2]
            Swap with A[i+1] continuously (like the web implementation) or swap with A[j]
            Move to right of pivot2
        */

        return pivots;
    }

}