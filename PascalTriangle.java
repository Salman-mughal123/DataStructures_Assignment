import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<Integer> getNthRow(int n) {
        List<Integer> row = new ArrayList<>();
        int element = 1; // First element is always 1
        row.add(element);

        for (int i = 1; i <= n; i++) {
            // Calculate the next element using the previous element
            element = element * (n - i + 1) / i;
            row.add(element);
        }

        return row;
    }

    public static void main(String[] args) {
        int n = 4; // 0-based row number
        List<Integer> F = getNthRow(n);
        System.out.println(F); // Output: [1, 4, 6, 4, 1]
    }
}