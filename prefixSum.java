public class prefixSum {

        public static int[] buildPrefixSum(int[] arr) {
            int[] prefix = new int[arr.length];
            prefix[0] = arr[0];
            for (int i = 1; i < arr.length; i++) {
                prefix[i] = prefix[i - 1] + arr[i];
            }
            return prefix;
        }
    
        public static void main(String[] args) {
            int[] arr = {2, 4, 1, 3, 6};
            int[] prefix = buildPrefixSum(arr);
            for (int sum : prefix) {
                System.out.print(sum + " ");
            }
        }
     
}