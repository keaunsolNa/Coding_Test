import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            String temp = st.nextToken();

            if(day == 0 && temp.equals("#")) break;

            int month = switch (temp) {
                case "January" -> 1;
                case "February" -> 2;
                case "March" -> 3;
                case "April" -> 4;
                case "May" -> 5;
                case "June" -> 6;
                case "July" -> 7;
                case "August" -> 8;
                case "September" -> 9;
                case "October" -> 10;
                case "November" -> 11;
                case "December" -> 12;
                default -> throw new IllegalStateException("Unexpected value: " + temp);
            };

            if(month == 8 && day == 4) sb.append("Happy birthday").append("\n");
            else if(month == 2 && day == 29) sb.append("Unlucky").append("\n");
            else {

                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date birthdayDate = dateFormat.parse("2007-" + month + "-" + day);
                Date standardDate = dateFormat.parse("2007-08-04");

                if (birthdayDate.before(standardDate)) sb.append("Yes").append("\n");
                else sb.append("No").append("\n");
            }
        }

        System.out.print(sb);
    }

}