import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Old way to declared and assign array
        int[] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;

        // new way to declared and assign array
        int[] numbers2 = { 1, 2, 3, 5, 0, 6 };

        // here is the way to print array
        System.out.println(Arrays.toString(numbers2));
        System.out.println(numbers2.length);
        Arrays.sort(numbers2);

        // Multi-dimentioned Array
        int[][] numbers3 = new int[2][3];
        numbers3[0][0] = 1;

        System.out.println(Arrays.deepToString(numbers3));

        // or write in new way
        int[][] numbers4 = { { 1, 2, 3, }, { 4, 5, 6 } };

        System.out.println(Arrays.deepToString(numbers3));
    }
}