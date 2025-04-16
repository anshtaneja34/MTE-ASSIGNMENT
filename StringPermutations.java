import java.util.ArrayList;
import java.util.List;

public class StringPermutations {

    public static List<String> permute(String s) {
        List<String> result = new ArrayList<>();
        backtrack(result, s, 0);
        return result;
    }

    private static void backtrack(List<String> result, String s, int start) {
        if (start == s.length()) {
            result.add(s);
            return;
        }
        for (int i = start; i < s.length(); i++) {
            s = swap(s, start, i);
            backtrack(result, s, start + 1);
            s = swap(s, start, i); // backtrack
        }
    }

    private static String swap(String s, int i, int j) {
        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(permute(s));
    }
}
