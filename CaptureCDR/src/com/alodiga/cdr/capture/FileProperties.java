package com.alodiga.cdr.capture;

/**
 *
 * @author jmatapro
 */
import java.io.FileReader;
import java.util.Properties;



public class FileProperties
{
  String direccionguardarsi;
  String direccionguardarno;
  String openSi;
  String openNo;
  
  public String getOpenSi() { return this.openSi; }


  
  public void setOpenSi(String openSi) { this.openSi = openSi; }


  
  public String getOpenNo() { return this.openNo; }


  
  public void setOpenNo(String openNo) { this.openNo = openNo; }



  
  public String getDireccionguardarsi() { return this.direccionguardarsi; }


  
  public void setDireccionguardarsi(String direccionguardarsi) { this.direccionguardarsi = direccionguardarsi; }


  
  public String getDireccionguardarno() { return this.direccionguardarno; }


  
  public void setDireccionguardarno(String direccionguardarno) { this.direccionguardarno = direccionguardarno; }



  
  public void readProperties() {
    try (FileReader reader = new FileReader("C:\\Program Files(x86)\\SistemaC\\config.properties")) {
      Properties pro = new Properties();
      pro.load(reader);
      this.direccionguardarsi = pro.getProperty("direcgusi");
      this.direccionguardarno = pro.getProperty("direcguno");
      this.openSi = pro.getProperty("openSi");
      this.openNo = pro.getProperty("openNo");

    
    }
    catch (Exception exception) {}
  }
}
