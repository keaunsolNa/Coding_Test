import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int number = 0;
		
		for(int i = 0; i < word.length(); i++) {
			char tempChar = word.charAt(i);
			
			if((int)tempChar <= 90) {
				number += ((int)tempChar) - 38;
				System.out.println(((int)tempChar) - 38);
			} else {
				number += ((int)tempChar) - 96;
				System.out.println(((int)tempChar) - 96);
			}
		}
		
		if(number == 1) {
			System.out.println("It is a prime word.");
		} 
		else
		if(isPrime(number)) {
			System.out.println("It is a prime word.");
		} else {
			System.out.println("It is not a prime word.");
		}
		
	}

    public static boolean isPrime(long n) {
		
        if(n == 1 || n == 0) return false;

        for(long i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }

        return true;
        
    }
}
