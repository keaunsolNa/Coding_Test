import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String binaryA = Integer.toBinaryString(Integer.parseInt(br.readLine()));
        String binaryB = Integer.toBinaryString(Integer.parseInt(br.readLine()));
        String binaryC = Integer.toBinaryString(Integer.parseInt(br.readLine()));

        while (binaryA.length() < 4)
        {
        	binaryA = "0" + binaryA;
        }
        
        while (binaryB.length() < 4)
        {
        	binaryB = "0" + binaryB;
        }
        
        while (binaryC.length() < 4)
        {
        	binaryC = "0" + binaryC;
        }
        
        String LSB4A = binaryA.substring(binaryA.length() - 4);
        String LSB4B = binaryB.substring(binaryB.length() - 4);
        String LSB4C = binaryC.substring(binaryC.length() - 4);
        
        String LSB4 = LSB4A + LSB4B + LSB4C;
        
        String decimal = String.valueOf(Integer.parseInt(LSB4, 2));

        while (decimal.length() < 4)
        {
        	decimal = "0" + decimal;
        }
        
        bw.write(decimal);
        bw.flush();
        bw.close();
        br.close();
    }
    
}
