import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] sequence = a.toCharArray();
        
        for(int i = 0; i < sequence.length; i++) {
        	
        	if((int)sequence[i] > 90) {
        		System.out.print((char)((int)sequence[i] - 32));
        	} else {
        		System.out.print((char)((int)sequence[i] + 32));
        	}
        }
    }
}