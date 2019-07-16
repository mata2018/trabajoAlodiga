package capture;
/**
 *
 * @author jmatapro
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

    
public class MainTest
{
  public static void main(String[] args) {
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    try {
      Date miFecha = formato.parse("18/10/2019");
      System.out.println("miFecha" + miFecha);
    } catch (ParseException ex) {
      System.out.println("ex = " + ex.getStackTrace());
      Logger.getLogger(MainTest.class.getName()).log(Level.SEVERE, null, ex);
    } 
  }
}
