import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	private static String input;
	private static StringBuilder sb = new StringBuilder();
	private static int idx = 0;

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        ArrayList<String> arr = new ArrayList<>();
        
        while ((input = br.readLine()) != null) {
        	
            StringTokenizer st = new StringTokenizer(input, " \t\n");
            
            while (st.hasMoreTokens()) arr.add(st.nextToken());

        }
        
        for (String str : arr) {
        	
            if (str.equals("<br>")) {
                br();
                continue;
            }

            if (str.equals("<hr>")) {
                hr();
                continue;
            }
            
            if (idx + str.length() + (idx == 0 ? 0 : 1) > 80) {
                idx = 0; 
                br();
            }
            
            if (idx != 0) sb.append(' ');
            sb.append(str);
            idx += str.length() + (idx == 0 ? 0 : 1);

        }
        
        br();
        System.out.print(sb);
	}

    private static void br() {
        sb.append('\n');
        idx = 0;
    }

    private static void hr() {
        if (idx != 0) br();
        for (int i = 0; i < 80; i++) sb.append('-');
        sb.append('\n');
        idx = 0;
    }
}
