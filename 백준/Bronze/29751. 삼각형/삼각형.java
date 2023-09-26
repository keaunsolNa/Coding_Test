import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    
	public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double W = Double.parseDouble(st.nextToken());
        double H = Double.parseDouble(st.nextToken());
        
        double answer = 0.5 * W * H;
        
        System.out.printf("%.1f", answer);
	}

}
