import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 2 4 8 6 2 4 8 6

        String s = br.readLine();
        if (s.equals("0"))
        {
            System.out.println(1);
            return;
        }

        String cycle = "6248";
        int lastTwoDigits = (s.length() == 1) ? Integer.parseInt(s) : Integer.parseInt(s.substring(s.length() - 2));

        bw.write(cycle.charAt(lastTwoDigits % 4));
        bw.flush();
        bw.close();
        br.close();

    }

}
