/******************************************************************
/CLASS: creates a rounded border for the customize and edit buttons
/*****************************************************************/  
import java.awt.*;
import javax.swing.border.Border;

class RoundBtn implements Border
{
   private int r;
   RoundBtn(int r) {
      this.r = r;
   }
   public Insets getBorderInsets(Component c) {
      return new Insets(this.r+1, this.r+1, this.r+2, this.r);
   }
   public boolean isBorderOpaque() {
      return true;
   }
   public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
      g.drawRoundRect(x, y, width-1, height-1, r, r);
   }
}