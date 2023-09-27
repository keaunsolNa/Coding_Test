import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    
	public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] date = br.readLine().split("-");
        int y = Integer.parseInt(date[0]);
        int m = Integer.parseInt(date[1]);
        int d = Integer.parseInt(date[2]);
        
        int cycle = Integer.parseInt(br.readLine());
        double Y = Math.floor(cycle / 360);
        double M = Math.floor((cycle / 30) - (Y * 12));
        double D = Math.floor(cycle % 30);

        d += D;
        
        if (d > 30) {
            d -= 30;
            m += 1;
        }

        m += M;
        if (m > 12) {
            m -= 12;
            y += 1;
        }
        
        y += Y;

        System.out.printf("%d-%02d-%02d%n", y, m, d);
    }

}
