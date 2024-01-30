import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int idx = 0;
        for(int i = input.length() - 1; i >= 0; i--) {

            char temp = input.charAt(i);
            if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') { idx = i; break; }
        }

        for(int i = 0; i <= idx; i++) System.out.print(input.charAt(i));
        System.out.print("ntry");

    }


}