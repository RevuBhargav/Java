package OneDArray;

public class LeadersInAnInteger {
	
	    public static void main(String[] args) {
	        // Example input array
	        int[] array = {14, 9, 11, 7, 8, 5, 3};

	        // Find leaders in the array
	        System.out.print("Leaders in the array: ");
	        findLeaders(array);
	    }

	    public static void findLeaders(int[] array) {
	        int n = array.length;
	        
	        // The last element is always a leader
	        int maxFromRight = array[n - 1];
	        System.out.print(maxFromRight + " ");

	        // Traverse the array from right to left
	        for (int i = n - 2; i >= 0; i--) {
	            if (array[i] > maxFromRight) {
	                maxFromRight = array[i];
	                System.out.print(maxFromRight + " ");
	            }
	        }
	    }
	}


