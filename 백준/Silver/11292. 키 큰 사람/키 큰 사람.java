import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        while(true) {
            int n = Integer.parseInt(br.readLine());
            String[][] str = new String[n][2];

            if(n == 0) {
                break;
            }

            double max = 0;
            
            for(int i = 0; i < n; i++) {
            	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            	
                str[i][0] = st.nextToken();
                str[i][1] = st.nextToken();
                max = Double.parseDouble(str[i][1]) > max ? Double.parseDouble(str[i][1]) : max;
            }
            
            String name = "";

            for (int i = 0; i < n; i++) {
                if(Double.parseDouble(str[i][1]) == max) {
                    name += str[i][0] + " ";

                }
            }
            System.out.println(name);
        }
		
	}
}
