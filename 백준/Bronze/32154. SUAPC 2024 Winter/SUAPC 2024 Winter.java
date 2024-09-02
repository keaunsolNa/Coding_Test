import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        switch (n)
        {
            case 1 : bw.write(11 + "\nA B C D E F G H J L M" ); break;
            case 2, 3: bw.write(9 + "\nA C E F G H I L M"); break;
            case 4 : bw.write(9 + "\nA B C E F G H L M"); break;
            case 5, 9, 8, 7, 6: bw.write(8 +"\nA C E F G H L M"); break;
            case 10 : bw.write(8 +"\nA B C F G H L M"); break;
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
