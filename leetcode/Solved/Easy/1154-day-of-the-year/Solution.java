class Solution {
    public int dayOfYear(String date) {
        
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));

        int februaryDays = isLeapYear(year) ? 29 : 28;
        int[] daysInMonth = {31, februaryDays, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int ans = day;
      
        for (int i = 0; i < month - 1; i++) {
            ans += daysInMonth[i];
        }
      
        return ans;

    }

    private boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}