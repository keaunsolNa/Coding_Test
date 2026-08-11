import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
	        if (time(a, b)) {
	            sb.append("Yes ");
	        } else {
	            sb.append("No ");
	        }

	        if (date(a, b)) {
	            sb.append("Yes\n");
	        } else {
	            sb.append("No\n");
	        }
		}
		
		sb.deleteCharAt(sb.length()-1);
		
		System.out.println(sb);
		
	}

    private static boolean time(int num1, int num2) {
        return (num1 < 24 && num1 >= 0) && (num2 < 60 && num2 >= 0);
    }

    private static boolean date(int num1, int num2) {
        boolean isValidDate = false;
        switch (num1) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (num2 > 0 && num2 <= 31) {
                    isValidDate = true;
                }
                break;
            case 2:
                if (num2 > 0 && num2 <= 29) {
                    isValidDate = true;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (num2 > 0 && num2 <= 30) {
                    isValidDate = true;
                }
                break;
            default:
                break;
        }
        return isValidDate;
    }
}
