import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        
        double total = 0;
        while(!(input = br.readLine()).equals("EOI")) {
        	
        	switch(input) {
        		case "Paper" : total += 57.99; break;
        		case "Printer" : total += 120.50; break;
        		case "Planners" : total += 31.25; break;
        		case "Binders" : total += 22.50; break;
        		case "Calendar" : total += 10.95; break;
        		case "Notebooks" : total += 11.20; break;
        		case "Ink" : total += 66.95; break;
        	}
        }
        
        System.out.println("$"+total);
	}
}
