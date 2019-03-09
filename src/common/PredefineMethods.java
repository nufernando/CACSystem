package common;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PredefineMethods {
    
    public static String getSystemDate(){
        return new SimpleDateFormat("EEE, MMM d, yyyy")
                .format(Calendar.getInstance().getTime());
    }
    
    public static String getSystemTime(){
        return new SimpleDateFormat("h:mm a")
                .format(Calendar.getInstance().getTime());
    }
}
