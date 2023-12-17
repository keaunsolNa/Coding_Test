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
        int[] arr = new int[3];
        for(int i = 0; i < n; i++) {

            char temp = input.charAt(i);
            if(temp == 'B') arr[0]++;
            else if(temp == 'S') arr[1]++;
            else arr[2]++;

        }

        if(arr[0] > arr[1] && arr[0] > arr[2]) System.out.println('B');
        else if(arr[1] > arr[0] && arr[1] > arr[2]) System.out.println('S');
        else if(arr[2] > arr[0] && arr[2] > arr[1]) System.out.println('A');
        else if(arr[0] == arr[1] && arr[1] == arr[2]) System.out.println("SCU");
        else if(arr[0] == arr[1]) System.out.println("BS");
        else if(arr[0] == arr[2]) System.out.println("BA");
        else if(arr[1] == arr[2]) System.out.println("SA");
	}
}
