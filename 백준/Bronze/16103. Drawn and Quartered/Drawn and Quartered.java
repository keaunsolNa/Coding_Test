import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken()) % 6;
        
        StringBuilder str = new StringBuilder(br.readLine());
        
        while (k --> 0) {
        	
        	String temp = str.substring(n / 4, n / 4 * 3);
        	str.delete(n / 4, n / 4 * 3);
        	str.append(temp);
        	
        }

        System.out.println(str);
        	
    }

}