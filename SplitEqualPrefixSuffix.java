public class SplitEqualPrefixSuffix {

        public static boolean canSplit(int[] arr) {
            int total = 0, prefixSum = 0;
            for (int num : arr) total += num;
            for (int i = 0; i < arr.length - 1; i++) {
                prefixSum += arr[i];
                if (prefixSum * 2 == total) return true;
            }
            return false;
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 3};
            boolean result = canSplit(arr);
            System.out.println(result);
        }

    
}
