import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

import static java.time.temporal.ChronoUnit.*;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String SY = st.nextToken();
		String SM = st.nextToken();
		String SD = st.nextToken();
		
		while(SY.length() != 4) SY = "0" + SY;
		while(SM.length() != 2) SM = "0" + SM;
		while(SD.length() != 2) SD = "0" + SD;
		
		st = new StringTokenizer(br.readLine());
		String EY = st.nextToken();
		String EM = st.nextToken();
		String ED = st.nextToken();

		while(EY.length() != 4) EY = "0" + EY;
		while(EM.length() != 2) EM = "0" + EM;
		while(ED.length() != 2) ED = "0" + ED;
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

		LocalDate SDate = LocalDate.parse(SY + SM + SD, formatter);
		LocalDate EDate = LocalDate.parse(EY + EM + ED, formatter);

		if(YEARS.between(SDate, EDate) >= 1000) System.out.println("gg");
		else System.out.println("D-" + DAYS.between(SDate, EDate));
   }
}