import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[26];
        while (n --> 0)
        {
        	char input = br.readLine().charAt(0);
        	arr[input - 'a'] = true;
        }

        for (int i = 0; i < 26; i++)
        {
        	if (i != 0 && i % 6 == 0) bw.write("\n");
        	if (arr[i]) bw.write((char)(i + 'a'));
        	else bw.write(".");
        }

        bw.flush();
        bw.close();
        br.close();

    }


}
