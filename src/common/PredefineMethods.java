package common;

import database.DBconnect;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.*; 

public class PredefineMethods {
    private String adminPassword = "12345";
    
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

    //Return admin Password
    public String getAdminPassword() {return adminPassword;}
    
    //new JoptionPane
    public static void viewJoptionPane(String message){
        JOptionPane.showMessageDialog(new JFrame(),message,"Alert",JOptionPane.WARNING_MESSAGE);    }
    
    //change database values (insert, update, delete)
    public static void editDB(String qry){
        try{ DBconnect.connect().prepareStatement(qry).execute();
        }catch(Exception e){e.printStackTrace();}}
    
    //view database values and return Resultset
    public static ResultSet viewDBresultset(String qry){
        ResultSet rs = null;
        try{ rs =  DBconnect.connect().prepareStatement(qry).executeQuery();
        }catch(Exception e){e.printStackTrace();}
           return rs;
    }
    
    //get single value from DB 
    public static String viewDBValue(String qry, String retrieveValue) throws SQLException{
        ResultSet rs = viewDBresultset(qry);
        String value= null;
        while(rs.next()){value = rs.getString(retrieveValue);}
        return value;
    }
    
    //get TextField Values to string
    public static String getTextField(JTextField text){return text.getText().toString();}
    
    //get TextLabel Values to string
    public static String getLabel(JLabel text){return text.getText().toString();}
    
    //get Button Values to string
    public static String getButton(JButton text){return text.getText().toString();}
    
    //set textFieldValue
    public static void setTextField(JTextField text, String value){text.setText(value); }
    
   
    
    
    
}
