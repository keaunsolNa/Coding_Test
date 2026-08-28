class Solution {
    public String findLatestTime(String s) {

        String hour = s.split(":")[0];   
        String min = s.split(":")[1];   

        System.out.println(hour);
        System.out.println(min);


        if (hour.charAt(0) == '?') hour = "1" +  hour.substring(1, 1);
        if (hour.charAt(1) == '?') hour = hour.substring(0, 1) + (hour.charAt(0) == '0' ? "9" : "1");

        if (min.charAt(0) == '?') min = "5" + min.substring(1, 1);
        // if (min.charAt(1) == '?') min = min.substring(0, 1) + "9";

        return hour + ":" + min;

    }
}