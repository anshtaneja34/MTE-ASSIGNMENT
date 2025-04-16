public class equilibriumInedxSum {

        public static int findEquilibriumIndex(int[] arr) {
            int total = 0, leftSum = 0;
            for (int num : arr) total += num;
            for (int i = 0; i < arr.length; i++) {
                total -= arr[i];
                if (leftSum == total) return i;
                leftSum += arr[i];
            }
            return -1;
        }
    
        public static void main(String[] args) {
            int[] arr = {3, 1, 5, 2, 2};
            int index = findEquilibriumIndex(arr);
            System.out.println(index);
        }
   
}