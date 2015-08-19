import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class TotalDays {

	public static void main(String[] args) throws ParseException {
		
		 Calendar cal1 = new GregorianCalendar();
	     Calendar cal2 = new GregorianCalendar();

	     SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");

	     //Date date = sdf.parse("your first date");
	     //cal1.setTime(date);
	     //date = sdf.parse("your second date");
	     //cal2.setTime(date);

	    cal1.set(2008, 8, 1); 
	    cal2.set(2008, 9, 31);
	    
	    System.out.println("cal1.getTime()    "+cal1.getTime());
	    System.out.println("cal2.getTime()    "+cal2.getTime());
	    
	     System.out.println("Days= "+daysBetween(cal1.getTime(),cal2.getTime()));

		

	}

	public static int daysBetween(Date d1, Date d2){
		System.out.println("d2 time==  "+d2.getTime());
		System.out.println("d1 time==  "+d1.getTime());
		return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
		
	}

}
