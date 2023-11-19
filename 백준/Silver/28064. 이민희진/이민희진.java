import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[] name = new String[N];
		for(int i = 0; i < N; i++) name[i] = br.readLine();
		
		int ans = 0;
        for (int i = 0; i < N - 1; i++) 
            for (int j = i + 1; j < N; j++) 
                if (check(name[i], name[j])) ans++;
        
		System.out.println(ans);
		
	}

    private static boolean check(String name1, String name2) {
    	
        int length1 = name1.length();
        int length2 = name2.length();
        int minLength = Math.min(length1, length2);

        for (int k = 1; k <= minLength; k++) {
            if (name1.substring(0, k).equals(name2.substring(length2 - k)) ||
                name1.substring(length1 - k).equals(name2.substring(0, k))) {
                return true;
            }
        }

        return false;
    }
}
