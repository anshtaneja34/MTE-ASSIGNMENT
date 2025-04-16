public class TwoSumSorted {

        public static int[] twoSum(int[] arr, int target) {
            int left = 0, right = arr.length - 1;
            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == target) {
                    return new int[] {left, right};
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
            return new int[] {}; 
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 6};
            int target = 6;
            int[] result = twoSum(arr, target);
            if (result.length > 0) {
                System.out.println("Indices: " + result[0] + ", " + result[1]);
            } else {
                System.out.println("No solution");
            }
        }
}
