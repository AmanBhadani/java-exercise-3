import java.util.*;
import java.time.*;
import java.text.*;

class Q3 {

    public static String formatDate (){
        // Get calendar set to current date and time
        Calendar c = Calendar.getInstance();

        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(df.format(c.getTime()));
        String str = (df.format(c.getTime()));
        //to loop through the days from given day to next 6 days
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        System.out.println(df.format(c.getTime()));
        String str1 = (df.format(c.getTime()));
        return str+str1; // return the concat of the statrt date and end date

    }
}
