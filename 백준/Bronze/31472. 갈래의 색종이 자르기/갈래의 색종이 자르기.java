import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int w = Integer.parseInt(br.readLine());
		
        for(int i = 2; i <= w; i += 2) {

			if(i * (i / 2) == w) System.out.println(i * 4);

		}
		
	}
}
