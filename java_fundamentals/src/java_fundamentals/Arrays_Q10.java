package java_fundamentals;

public class Arrays_Q10 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] result = new int[arr.length];

        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[left] = arr[i]; 
                left++;
            } else {
                result[right] = arr[i]; 
                right--;
            }
        }
        System.out.print("{");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
