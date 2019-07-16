package com.alodiga.cdr.capture;

/**
 *
 * @author jmatapro
 */
import javax.swing.JProgressBar;

public class ProgressBarPainter
  implements Runnable
{
  public JProgressBar jProgressBar1;
  
  public void run() {
    try {
      while (true)
      { Thread.sleep(50L);
        this.jProgressBar1.repaint(); } 
    } catch (InterruptedException ex) {
      return;
    } 
  }
}