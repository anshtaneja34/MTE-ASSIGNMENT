import java.util.PriorityQueue;
public class kthSmallest {
   


    static class Tuple {
        int val, row, col;
        Tuple(int v, int r, int c) {
            val = v;
            row = r;
            col = c;
        }
    }

    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<Tuple> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (int i = 0; i < Math.min(n, k); i++) {
            pq.offer(new Tuple(matrix[i][0], i, 0));
        }

        for (int i = 0; i < k - 1; i++) {
            Tuple curr = pq.poll();
            if (curr.col + 1 < matrix[0].length) {
                pq.offer(new Tuple(matrix[curr.row][curr.col + 1], curr.row, curr.col + 1));
            }
        }

        return pq.poll().val;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;
        System.out.println(kthSmallest(matrix, k));
    }
}

