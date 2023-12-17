import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        int[] arr = new int[26];
        for(int i = 0; i < n; i++) {

            char temp = input.charAt(i);
            if(temp != ' ' && temp != ',' && temp !='.') arr[temp - 'a']++;
        }

        Arrays.sort(arr);

        System.out.println(arr[25]);
	}
}
