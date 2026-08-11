import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String[] start = br.readLine().split(":");
	   String[] end = br.readLine().split(":");
	 
	   int now = Integer.parseInt(start[2]) + (Integer.parseInt(start[1]) * 60) + (Integer.parseInt(start[0]) * 3600);
	   int startT = Integer.parseInt(end[2]) + (Integer.parseInt(end[1]) * 60) + (Integer.parseInt(end[0]) * 3600);
	   
	   int termTime;
	   if(startT > now) termTime = startT - now;
	   else termTime = 86400 - (now - startT);
	   
	   int hh = termTime / 3600;
	   int mm = (termTime / 60) % 60;
	   int ss = termTime % 60;
	   
	   System.out.format("%02d:%02d:%02d\n", hh, mm, ss);
   }
}
