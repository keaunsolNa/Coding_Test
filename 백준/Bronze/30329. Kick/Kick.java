import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String input = br.readLine();
       int ans = 0;

       for (int i = 0; i < input.length() - 3; i++) {

           if(input.startsWith("kick", i)) ans++;
       }

        System.out.println(ans);


    }


}