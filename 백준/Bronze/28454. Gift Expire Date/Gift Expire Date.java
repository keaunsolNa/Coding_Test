import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

   public static void main(String[] args) throws ParseException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = formatter.parse(br.readLine());

        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        
        for(int i = 0; i < N; i++) {
        	
            Date date = formatter.parse(br.readLine());
            if (date.after(currentDate) || date.equals(currentDate)) answer++;
        }


		System.out.println(answer);
   }
}