import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    
	public static void main(String[] args) throws NumberFormatException, IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        int len1 = input.length();
        input = input.replaceAll("DKSH", "");
        int len2 = input.length();

        System.out.println((len1 - len2) / 4);

    }

}
