package Basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyy");

		System.out.println(sdf.format(date));
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

		System.out.println(timeStamp);

		Calendar c = Calendar.getInstance();
		
	System.out.println(sdf.format(c.getWeeksInWeekYear()));
	}

}
