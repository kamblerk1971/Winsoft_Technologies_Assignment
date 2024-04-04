/*
 Q1: Merge two arrays by satisfying given constraints
Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
 merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.

For example,

Input: X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 }
Y[] = { 1, 8, 9, 10, 15 } The vacant cells in X[] is represented by 0 
Output: X[] = { 1, 2, 3, 5, 6, 8, 9, 10, 15 }

*/

class MergeArray {
  
    private static void merge(int[] x, int[] y, int m, int n) {
        
        // here m is a length of the array x 
        // n is a length of the array y 
        int k = m + n + 1;

        while (m >= 0 && n >= 0) {
            if (x[m] > y[n]) {
                x[k--] = x[m--];
            } else {
                x[k--] = y[n--];
            }
        }

        while (n >= 0) {
            x[k--] = y[n--];
        }

       
    }

    

    public static void rearrange(int[] x, int[] y) {
        if (x.length == 0) {
            return;
        }

        int k = 0;
        for (int value : x) {
            if (value != 0) {
                x[k++] = value;
            }
        }
        
        // calling merge method for merge the both arrays.
        merge(x, y, k - 1, y.length - 1);
    }

    public static void main(String[] args) {
        
        // sample data
        int[] x = {0, 0, 0, 3, 0, 5, 6, 0, 0};
        int[] y = {1, 2, 8, 9, 10, 15};

       

        rearrange(x, y);

        // print merged array 
        for (int num : x) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

  
}
