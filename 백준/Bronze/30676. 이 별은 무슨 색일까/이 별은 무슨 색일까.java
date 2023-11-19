import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int color = Integer.parseInt(br.readLine());
		
		System.out.println(color >= 620 ? "Red" : color >= 590 ? "Orange" : color >= 570 ? "Yellow" : color >= 495 ? "Green" : color >= 450 ? "Blue" : color >= 425 ? "Indigo" : "Violet");
		
   }
}