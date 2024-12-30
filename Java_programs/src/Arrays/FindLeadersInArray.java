package Arrays;


public class FindLeadersInArray {
	    public static void main(String[] args) {
	        int[] array = {14, 9, 11, 7, 8, 5, 3};

	        System.out.println("Input array:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }

	        System.out.println("\nLeaders in the array:");
	        findLeaders(array);
	    }

	    public static void findLeaders(int[] array) {
	        

	        // Array to store leaders in reverse order
	        int[] tempLeaders = new int[array.length];
	        int count = 0;

	        // The last element is always a leader
	        int maxFromRight = array[array.length - 1];
	        tempLeaders[count++] = maxFromRight;

	        // Traverse the array from right to left
	        for (int i = array.length - 2; i >= 0; i--) {
	            if (array[i] > maxFromRight) {
	                maxFromRight = array[i];
	                tempLeaders[count++] = maxFromRight;
	            }
	        }

	        // Print leaders in correct order
	        for (int i = count - 1; i >= 0; i--) {
	            System.out.print(tempLeaders[i] + " ");
	        }
	    }
	}


