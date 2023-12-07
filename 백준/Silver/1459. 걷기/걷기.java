import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long  X = Integer.parseInt(st.nextToken());
		long  Y = Integer.parseInt(st.nextToken());
		long  W = Integer.parseInt(st.nextToken());
		long  S = Integer.parseInt(st.nextToken());

		long temp1;
		long temp2;
		long temp3;

		temp1 = (X + Y) * W;
        temp2 = 0;
        
        if((X + Y) % 2 == 0) temp2 = Math.max(X, Y) * S;
        else temp2 = (Math.max(X, Y) - 1) * S + W;

        temp3 = (Math.min(X, Y)) * S + (Math.abs(X - Y)) * W;

        System.out.println(Math.min(temp1, Math.min(temp2, temp3)));
	}
}
