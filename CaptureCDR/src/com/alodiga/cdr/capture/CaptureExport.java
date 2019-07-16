package com.alodiga.cdr.capture;
/**
 *
 * @author jmatapro
 */
public class CaptureExport
{
  public static final String FORMAT_CSV = "csv";
  public static final String NAME_CSV = "Formato .CSV";
  public static final String urlConexion = "jdbc:mysql://localhost/capturecdr";
  public static final String user = "root";
  public static final String password = "root";
  public String calldatetime;
  public String ani;
  public String dni;
  public String seconds;
  
  public String getCalldatetime() { return this.calldatetime; }


  
  public void setCalldatetime(String calldatetime) { this.calldatetime = calldatetime; }


  
  public String getAni() { return this.ani; }


  
  public void setAni(String ani) { this.ani = ani; }


  
  public String getDni() { return this.dni; }


  
  public void setDni(String dni) { this.dni = dni; }


  
  public String getSeconds() { return this.seconds; }


  
  public void setSeconds(String seconds) { this.seconds = seconds; }
}
