import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    
	public static void main(String[] args) throws NumberFormatException, IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String input = br.readLine();

        switch(input) {
            case "M" : System.out.println("MatKor"); break;
            case "W" : System.out.println("WiCys"); break;
            case "C" : System.out.println("CyKor"); break;
            case "A" : System.out.println("AlKor"); break;
            case "$" : System.out.println("$clear"); break;
        }
	}

}
