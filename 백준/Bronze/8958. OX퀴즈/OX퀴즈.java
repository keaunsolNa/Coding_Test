import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		test23();
	}

	public static void test23() {
      	Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[length];
		
		for(int i = 0; i < length; i++) {
			arr[i] = sc.nextLine();
		}
		
		int score = 0;
		int totalScore = 0;
		
		for(int i = 0; i < arr.length; i++) {
			char[] temp = arr[i].toCharArray();
			
			for(int j = 0; j < temp.length; j++) {
				if(temp[j] == 'O') {
					score++;
					totalScore += score;
				} else if(temp[j] == 'X'){
					score = 0;
				}
			}
			System.out.println(totalScore);
			score = 0;
			totalScore = 0;
		}
	}
}
