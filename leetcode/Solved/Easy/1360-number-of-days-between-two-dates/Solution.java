import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Solution {
	public int daysBetweenDates(String date1, String date2) {

		long diffDays = 0;

		try {

			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date date1d = formatter.parse(date1);
			Date date2d = formatter.parse(date2);

			long diffSec = (date1d.getTime() - date2d.getTime()) / 1000;
			diffDays = diffSec / (24*60*60);

		} catch (ParseException e) {

		}

		return (int) Math.abs(diffDays);

	}
}