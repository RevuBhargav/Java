package OneDArray;

public class FindIndexWithoutMethodsInArray {
	

	    public static void main(String[] args) {
	        int[] array = {10, 20, 30, 40, 50, 60, 70};
	        int elementToFind = 40;
	        int index =-1;
	        for(int i=0;i<array.length;i++) {
	        	if(array[i]== elementToFind) {
	        		index = i;
	        		break;
	        	}
	        }

	         if (index != -1) {
	            System.out.println("Element " + elementToFind + " found at index: " + index);
	        } else {
	            System.out.println("Element " + elementToFind + " is not present in the array.");
	        }
	    }
	}


