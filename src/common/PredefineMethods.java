package common;

import database.DBconnect;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.*; 
import org.freixas.jcalendar.JCalendarCombo;
import java.util.*;
import static javax.swing.JOptionPane.showConfirmDialog;
import net.proteanit.sql.DbUtils;

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
    
    //new JoptionPane Dialog Box
    public static int viewJoptionPaneConfirm(String message){
        return JOptionPane.showConfirmDialog(new JFrame(),message,"Alert",JOptionPane.WARNING_MESSAGE); 
    }
    
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
    
    //get Selected ComboBoxValue 
    public static String getSelectedCombo(JComboBox box){return box.getSelectedItem().toString();}
    
        //get Selected ComboBoxValue 
    public static String getSelectedDate(JCalendarCombo box){return box.getSelectedItem().toString();}
    
    //get TextLabel Values to string
    public static String getLabel(JLabel text){return text.getText().toString();}
    
    //get Button Values to string
    public static String getButton(JButton text){return text.getText().toString();}
    
    //set textFieldValue
    public static void setTextField(JTextField text, String value){text.setText(value); }
    
    //set comboBox Value
    public static void setComboBox(JComboBox box, String value){box.setSelectedItem(value); }
    
    //Fill combox with database values
    public static void fillComboBox(JComboBox box, String qry) throws SQLException{
        ResultSet rs = viewDBresultset(qry);
         while (rs.next()) {box.addItem(rs.getString(1));}
    }
    
    //to write String in a file
    public static void writeInFile (String filePath, String text) throws IOException{
        FileOutputStream outputStream = new FileOutputStream(filePath);
        byte[] strToBytes = text.getBytes();
        outputStream.write(strToBytes);
        outputStream.close();
    }
    
    //Read file to srting 
    public static String readFile (String filePath) throws IOException{
        File file = new File(filePath);
        StringBuilder fileContents = new StringBuilder((int)file.length());    
        try (Scanner scanner = new Scanner(file)) {
        while(scanner.hasNextLine()) {
            fileContents.append(scanner.nextLine() + System.lineSeparator());}
      } String result = "";
        for(int x = 0 ; x < fileContents.toString().length() ; x++){
            if(Character.isLetter(fileContents.toString().charAt(x))){
                result = result + fileContents.toString().charAt(x);}
        } return result;
    }
    
    //tableload 
    public static void tableload(String qry, JTable table){
        try{ table.setModel(DbUtils.resultSetToTableModel(viewDBresultset(qry)));
        }catch(Exception e){e.printStackTrace();}
    }
    
    //Get update value
    public static String getUpdateValue (String msg, String actualValue){
        String input = JOptionPane.showInputDialog(null,msg);
        if(input == (null) ){
            input = actualValue;
        }
        return input;
    }
   
   
}
