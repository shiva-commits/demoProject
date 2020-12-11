import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendarDemo {
	
	public static void main(String []args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.AUGUST));
		System.out.println(cal.getTime());
	}

}