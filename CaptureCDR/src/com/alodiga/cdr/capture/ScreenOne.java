package com.alodiga.cdr.capture;

/**
 *
 * @author jmatapro
 */
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.SoftBevelBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.Orientation;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;


public class ScreenOne() extends JFrame {

  Connection conn = null;
  ResultSet rs = null;
  PreparedStatement pst = null;

  
  public final String base = "/";
  
  public final String base2 = "-";

  Generate generate = new Generate();
  public String so = System.getProperty("os.name");
  String ruta = this.so.equals("Linux") ? "/home/josemata/Escritorio/Conciliados.xls" : (System.getProperty("os.arch").equals("amd64") ? "C:\\Users\\Public\\Documents\\Conciliados.xls" : "C:\\Users\\Public\\Documents\\Conciliados.xls"); 
  int x; 
  public String filename1; 
  public String filename2; 
  public String architech; 
  public JButton excelNo; 
  public JButton excelYes; 
  public JTextField jAni;
  String ruta1 = this.so.equals("Linux") ? "/home/josemata/Escritorio/No_Conciliados.xls" : (System.getProperty("os.arch").equals("amd64") ? "C:\\Users\\Public\\Documents\\No_Conciliados.xls" : "C:\\Users\\Public\\Documents\\No_Conciliados.xls"); 
  private JButton jButton6; 
  public JTextField jDni; 
  private JLabel jLabel1; 
  private JLabel jLabel14; 
  private JLabel jLabel2; 
  private JLabel jLabel3; 
  
  public ScreenOne() {
    try {
      if (System.getProperty("os.name").equals("Linux")) {
        this.so = "Linux";
        System.out.println("so=" + this.so);
      } else if (System.getProperty("os.name").equals("Windows")) {
        System.out.println("so=" + this.so);
        this.so = "Windows";
      } 
      this.conn = (Connection) ConexionBD.ConnecBd("jdbc:mysql://localhost/capturecdr", "root", "root");
      initComponents();
      setLocationRelativeTo(null);
      try {
        finalize();
      } catch (Throwable ex) {
        JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos jdbc:mysql://localhost/capturecdr Con el usuario: root");
      } 


      
      setIconImage((new ImageIcon(getClass().getResource("/capture/photo1.png"))).getImage());
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos jdbc:mysql://localhost/capturecdr Con el usuario: root");
    } catch (ClassNotFoundException|java.awt.HeadlessException ex) {
      JOptionPane.showMessageDialog(null, "Ha ocurrido un error general. Consulte con su analista de sistemas");
    } 
  }
  private JLabel jLabel4; private JLabel jLabel5; private JLabel jLabel6; private JLabel jLabel7; private JLabel jLabel8; private JLabel jLabel9; private JPanel jPanel1; public JTextField jSecond; public JTextField jTime; public JButton loadAlodiga; public JButton loadProvider;
  private JLabel txtArchivo;
  private JLabel txtArchivo1;
  
  public void truncate() {
    String sql = "TRUNCATE `capturecdr`.`tbprovide`;";
    this.pst = (PreparedStatement) this.conn.prepareStatement(sql); 
    this.pst.executeUpdate(); 
  }

   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
