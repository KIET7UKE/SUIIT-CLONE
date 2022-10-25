public class FindMin {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 7, 2, 9};
        System.out.println(minValue(arr));
    }

    static int minValue(int[] arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
