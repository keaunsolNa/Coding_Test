import java.io.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double m = Integer.parseInt(br.readLine());

        if(m <= 30) System.out.printf("%.1f", (m / 2));
        else System.out.printf("%.1f", ((15 + ((m - 30) * 1.5))));

    }

}
