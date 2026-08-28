class Solution {
    public String maximumTime(String time) {
        
        String hour = time.split(":")[0];
        String min = time.split(":")[1];
        boolean chk = false;

        if (hour.charAt(0) == '?') {
            hour = "2" + hour.charAt(1);
            chk = true;
        }

        if (hour.charAt(1) == '?') hour = hour.charAt(0) + (hour.charAt(0) == '2' ? "3" : "9");
        if ((char) hour.charAt(1) - '0' >= 4 && chk) hour = "1" + hour.charAt(1);

        if (min.charAt(0) == '?') min = "5" + min.charAt(1);
        if (min.charAt(1) == '?') min = min.charAt(0) + "9";

        return hour + ":" + min;

    }
}