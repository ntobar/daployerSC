import java.awt.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;

public class OpenView extends JPanel {
  private JButton deployButton;
  private JButton interactButton;
  private Color MAIA_BG_COLOR;
  private Color MAIA_LOGO_COLOR;


  public OpenView() {

    this.MAIA_BG_COLOR = new Color(40, 45, 51);
    this.MAIA_LOGO_COLOR = new Color(144, 195, 240);


    this.setBackground(MAIA_BG_COLOR);
    GridBagConstraints c = new GridBagConstraints();
    c.insets = new Insets(15,0,15,0);
    //this.setLayout(new GridBagLayout());
    this.setLayout(new CardLayout());

    //----------------------------------------------------------------------------------------------
    //------------------------------------- BUTTON SETUP -------------------------------------------
    //----------------------------------------------------------------------------------------------


    deployButton = new JButton("Deploy a Smart Contract");
    //createButton.setHorizontalAlignment(SwingConstants.LEFT);
    deployButton.setPreferredSize(new Dimension(300, 50));
    deployButton.setOpaque(true);
    deployButton.setBackground(MAIA_BG_COLOR);
    deployButton.setForeground(MAIA_LOGO_COLOR);
    deployButton.setBorder(BorderFactory.createBevelBorder(
            BevelBorder.RAISED, MAIA_LOGO_COLOR, MAIA_LOGO_COLOR,
            MAIA_LOGO_COLOR, MAIA_LOGO_COLOR));
    deployButton.setActionCommand("deployContract");

    c.gridx = 1;
    c.gridy = 1;
    this.add(deployButton, c);
    //this.add(deployButton);


    interactButton = new JButton("Interact with an existing Smart Contract");
    interactButton.setPreferredSize(new Dimension(300, 50));
    interactButton.setOpaque(true);
    interactButton.setBackground(MAIA_BG_COLOR);
    interactButton.setForeground(MAIA_LOGO_COLOR);
    interactButton.setBorder(BorderFactory.createBevelBorder(
            BevelBorder.RAISED, MAIA_LOGO_COLOR, MAIA_LOGO_COLOR,
            MAIA_LOGO_COLOR, MAIA_LOGO_COLOR));
    interactButton.setActionCommand("interactContract");

    c.gridx = 1;
    c.gridy = 2;
    this.add(interactButton, c);
    //this.add(interactButton);
  }


  public JButton getDeployButton() {
    return deployButton;
  }

  public JButton getInteractButton() {
    return interactButton;
  }


}
