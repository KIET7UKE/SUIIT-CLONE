import java.util.Arrays;

public class Searchin2DArrays {
    public static void main(String[] args) {

        int[][] arr = {
                {3, 5, 4},
                {66, 5, 43, 12},
                {9, 7}
        };
        int target = 12;
        int[] ans = Searchin2D(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(Max(arr));
    }

    static int[] Searchin2D(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target)
                   return new int[]{row,col};
            }
        }
        return new int[]{-1, -1};
    }

    static int Max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
