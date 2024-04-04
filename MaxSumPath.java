public class MaxSumPath{
    public static int[] maxPathSum(int[] ar1, int[] ar2, int m, int n) {
        int[] path = new int[m + n];
        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0;
        int result = 0;
        int pathIndex = 0;

        // Merge operation similar to merge sort
        while (i < m && j < n) {
            // Add elements of ar1[] to sum1
            if (ar1[i] < ar2[j]) {
                sum1 += ar1[i];
                i++;
            } else if (ar1[i] > ar2[j]) {
                sum2 += ar2[j];
                j++;
            } else {
                result += Math.max(sum1, sum2);
                sum1 = sum2 = 0;
                while (i < m && j < n && ar1[i] == ar2[j]) {
                    result += ar1[i];
                    path[pathIndex++] = ar1[i];
                    i++;
                    j++;
                }
            }
        }

        while (i < m) {
            sum1 += ar1[i];
            i++;
        }

        while (j < n) {
            sum2 += ar2[j];
            j++;
        }

        result += Math.max(sum1, sum2);

        pathIndex = 0;
        for (int k = 0; k < m; k++) {
            if (ar1[k] == path[pathIndex]) {
                path[pathIndex++] = ar1[k];
            }
        }

        path[pathIndex] = sum1;

        System.out.println("Maximum sum is " + result);
        System.out.print("Maximum sum path is: ");
        for (int k = 0; k <= pathIndex; k++) {
            System.out.print(path[k] + " ");
        }
        System.out.println();

        return path;
    }

    public static void main(String[] args) {
        int[] ar1 = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] ar2 = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};
        int m = ar1.length;
        int n = ar2.length;

        maxPathSum(ar1, ar2, m, n);
    }
}