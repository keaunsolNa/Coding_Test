import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        String st = br.readLine();

        String[] arr = new String[st.length()];

        for(int i=0; i < st.length(); i++){
            arr[i] = st.substring(i);
        }

        Arrays.sort(arr);

        for(int i=0; i < st.length(); i++){
            out.append(arr[i]).append('\n');
        }

        System.out.println(out);
    }
}