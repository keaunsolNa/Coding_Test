import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] date = br.readLine().split("-");

        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        String ans = "";
        switch(month) {

            case 1 :
                if(day <= 19) ans = "Capricorn";
                else ans = "Aquarius";
                break;
            case 2 :
                if(day <= 18) ans = "Aquarius";
                else ans = "Pisces";
                break;
            case 3 :
                if(day <= 20) ans = "Pisces";
                else ans = "Aries";
                break;
            case 4 :
                if(day <= 19) ans = "Aries";
                else ans = "Taurus";
                break;
            case 5 :
                if(day <= 20) ans = "Taurus";
                else ans = "Gemini";
                break;
            case 6 :
                if(day <= 20) ans = "Gemini";
                else ans = "Cancer";
                break;
            case 7 :
                if(day <= 22) ans = "Cancer";
                else ans = "Leo";
                break;
            case 8 :
                if(day <= 22) ans = "Leo";
                else ans = "Virgo";
                break;
            case 9 :
                if(day <= 22) ans = "Virgo";
                else ans = "Libra";
                break;
            case 10 :
                if(day <= 22) ans = "Libra";
                else ans = "Scorpio";
                break;
            case 11 :
                if(day <= 22) ans = "Scorpio";
                else ans = "Sagittarius";
                break;
            case 12 :
                if(day <= 21) ans = "Sagittarius";
                else ans = "Capricorn";
        }

        System.out.println(ans);
    }

}