// Find number is palindrome or not.
//Input: 123321
//Output: true

import java.util.*;

public class PalindromeNumber {
    public static boolean palindrome(int n) {
        int sum = 0;
        int newNum = n;

        while(n != 0) {
            int lastDigit = n % 10;
            sum = sum * 10 + lastDigit;
            n /= 10;
        }

        if(newNum == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = palindrome(n);
        System.out.println(result);
        sc.close();
    }
}