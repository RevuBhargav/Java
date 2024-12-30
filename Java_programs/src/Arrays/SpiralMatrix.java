package Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3, 4},
            {4, 5, 2, 3},
            {9, 4, 5, 2}
        };

        int top = 0, left = 0;
        int bottom = arr.length - 1;  
        int right = arr[0].length - 1; 

        while (top <= bottom && left <= right) {
            
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++; 

            
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--; 

            
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--; 
            }
              if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++; 
            }
        }
    }
}
