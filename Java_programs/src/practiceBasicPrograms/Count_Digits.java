package practiceBasicPrograms;

import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();  
        int count = 0;
        int sum=0;

        
     //  num = Math.abs(num);  // Convert to positive if number is negative

        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num /= 10;
                sum+=num;
                count++;  
            }
        }

        
        System.out.println("Number of digits: " + count);
        System.out.println("sum of digits: " + sum);
        sc.close();
    }
}
