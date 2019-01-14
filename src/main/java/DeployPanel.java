import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class DeployPanel extends JPanel {
  private Color MAIA_BG_COLOR;
  private Color MAIA_LOGO_COLOR;


  public DeployPanel() {

    this.MAIA_BG_COLOR = new Color(40, 45, 51);
    this.MAIA_LOGO_COLOR = new Color(144, 195, 240);


    this.setBackground(MAIA_BG_COLOR);

    Border border = BorderFactory.createMatteBorder(6, 6, 6, 6,
            MAIA_LOGO_COLOR);

    this.setBorder(BorderFactory.createTitledBorder(border, "Deploy a Smart Contract",
            0, 0, Font.getFont(Font.DIALOG),
            MAIA_LOGO_COLOR));







  }




}
