package common;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.naming.Context;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PredefineMethods {
    
    //Get System date function
    public static String getSystemDate(){
        return new SimpleDateFormat("EEE, MMM d, yyyy")
                .format(Calendar.getInstance().getTime());
    }
    
    //Get System Time Function
    public static String getSystemTime(){
        return new SimpleDateFormat("h:mm a")
                .format(Calendar.getInstance().getTime());
    }
    
    //To Set Panel Color Function
    public static void setColor(JPanel panel) { panel.setBackground(new Color(0, 165, 165));}
    
    //To Reset Panel Color Function
    public static void resetColor(JPanel panel) { panel.setBackground(new Color(0, 150, 150));}
    
    //To Set Button Color function 
    public static void setButtonColor(JButton button) { button.setBackground(new Color(0, 165, 165));}
    
    //To reset Button Color function 
    public static void resetButtonColor(JButton button) { button.setBackground(new Color(0, 150, 150));}
    
}
