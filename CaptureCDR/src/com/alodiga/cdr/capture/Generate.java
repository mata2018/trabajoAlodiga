package com.alodiga.cdr.capture;

/**
 *
 * @author jmatapro
 */
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Generate
{
  public final String base = "/";
  public final String base2 = "-";
  
  public Timer t;
  
  public ActionListener ac;
  int x;
  
  public static Date generateCalender(Date myDate, int hour) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(myDate);
    calendar.add(10, hour);
    return calendar.getTime();
  }

  
  public void validateDate(String call, String aniLeng, String dniLeng, String sec) {
    if (call.equals("") || aniLeng.equals("") || dniLeng.equals("") || sec.equals("")) {
      JOptionPane.showMessageDialog(null, "No debe dejar ESPACIO en blanco", "Error al Cargar las Variables", 0);
      System.exit(0);
    } else {
      System.out.println("Trabaja con Normalidad!!!");
    } 
  }
}
