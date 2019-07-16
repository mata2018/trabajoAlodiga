package com.alodiga.cdr.capture;

/**
 *
 * @author jmatapro
 */
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;












public class ProgressBarThread
  extends Thread
{
  public static int beginning = 0;
  public static int ending = 0;
  public static int current = 0;


  
  public void run() {
    JFrame f = new JFrame("JProgressBar Sample");
    f.setDefaultCloseOperation(3);
    Container content = f.getContentPane();
    final JProgressBar progressBar = new JProgressBar();
    Border border = BorderFactory.createTitledBorder("Reading...");
    progressBar.setBorder(border);
    content.add(progressBar, "North");
    f.setSize(300, 100);
    f.setVisible(true);
    for (int i = beginning; i <= ending; i++) {
      
      try {
        SwingUtilities.invokeLater(new Runnable()
            {
              public void run() {
                System.out.println("current" + ProgressBarThread.current);
                
                progressBar.setValue(ProgressBarThread.current);
                progressBar.setStringPainted(true);
              }
            });
        Thread.sleep(3000L);
      } catch (InterruptedException e) {
        JOptionPane.showMessageDialog(f, e.getMessage());
      } 
    } 
  }
}
