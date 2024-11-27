package practiceBasicPrograms;

public class DecimalToBinaryBITWISE {
	 public static String decimalToBinary(int decimal) {  
	        StringBuilder binary = new StringBuilder();          
	        // Loop through each bit of the integer  
	        for (int i = 31; i >= 0; i--) {  
	            // Shift the bits of the decimal to the right, one by one  
	            int bit = (decimal >> i) & 1;  
	            // Append the current bit to the binary representation  
	            binary.append(bit);  
	        }          
	        // Trim leading zeros  
	        binary = new StringBuilder(binary.toString().replaceFirst("^0+(?!$)", ""));          
	        // If the input decimal was 0, return "0"  
	        if (binary.length() == 0) {  
	            binary.append("0");  
	        }          
	        return binary.toString();  
	    }      
	    public static void main(String[] args) {  
	        int decimal = 10;  
	        System.out.println("Binary representation of " + decimal + " is: " + decimalToBinary(decimal));  
	    }  
}
