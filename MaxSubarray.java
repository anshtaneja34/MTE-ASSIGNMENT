public class MaxSubarray {
        public static int maxSum(int[] arr, int k) {
            if (arr.length < k) return -1;
            int windowSum = 0, maxSum;
            for (int i = 0; i < k; i++) windowSum += arr[i];
            maxSum = windowSum;
            for (int i = k; i < arr.length; i++) {
                windowSum += arr[i] - arr[i - k];
                maxSum = Math.max(maxSum, windowSum);
            }
            return maxSum;
        }
    
        public static void main(String[] args) {
            int[] arr = {2, 1, 5, 1, 3, 2};
            int k = 3;
            System.out.println(maxSum(arr, k));
        }
    
}
