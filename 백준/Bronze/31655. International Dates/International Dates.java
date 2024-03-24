import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "/");

        int DDOrMM = Integer.parseInt(st.nextToken());
        int MMorDD = Integer.parseInt(st.nextToken());

        if(DDOrMM > 12) System.out.println("EU");
        else if(MMorDD > 12) System.out.println("US");
        else System.out.println("either");


    }



}