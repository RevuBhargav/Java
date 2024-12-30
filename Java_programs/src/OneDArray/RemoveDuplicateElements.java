package OneDArray;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {20, 40, 20, 30, 40, 50, 50, 60};
        System.out.println("length : " +arr);
        for(int a : arr) {
        	System.out.print(a+" ");
        }
        
        int arr1 = removeDuplicates(arr);
        System.out.print("\nUpdated array: ");
        for (int i = 0; i < arr1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nNew length: " + arr1);
    }

    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1) {
            return n;
        }

        int j = 0; 
        for (int i = 0; i < n; i++) {
            boolean Duplicate = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == arr[k]) {
                    Duplicate = true;
                    break;
                }
            }
            if (!Duplicate) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
}

