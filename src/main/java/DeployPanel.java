import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;


/**
 * NEED at LEAST 4 or 5 Panels
 */
public class DeployPanel extends JPanel {
  private Color MAIA_BG_COLOR;
  private Color MAIA_LOGO_COLOR;
  private JPanel logoPanel;
  private JPanel uploadPanel;
  private JPanel contractsPanel;
  private JPanel fieldsPanel;
  private JPanel resultPanel;


  public DeployPanel() {

    this.MAIA_BG_COLOR = new Color(40, 45, 51);
    this.MAIA_LOGO_COLOR = new Color(144, 195, 240);


    this.setBackground(MAIA_BG_COLOR);

    Border border = BorderFactory.createMatteBorder(6, 6, 6, 6,
            MAIA_LOGO_COLOR);

    this.setBorder(BorderFactory.createTitledBorder(border, "Deploy a Smart Contract",
            0, 0, Font.getFont(Font.DIALOG),
            MAIA_LOGO_COLOR));

    GridBagConstraints c = new GridBagConstraints();

//    this.setLayout(new GridBagLayout());
    this.setLayout(new GridLayout());
//    c.insets.set(10,10,10,10);



    //--------------------------------------------------------------------------------------------
    //------------------------------------- Logo Panel setup -------------------------------------
    //--------------------------------------------------------------------------------------------

    Border logoPanelBorder = BorderFactory.createMatteBorder(2, 2, 2, 2,
            MAIA_LOGO_COLOR);


    logoPanel = new JPanel();
    logoPanel.setBackground(MAIA_BG_COLOR);
    logoPanel.setBorder(logoPanelBorder);
//    logoPanel.setPreferredSize(new Dimension(900,200));

    JLabel logoLabel = new JLabel("Interact");

    c.gridx = 0;
    c.gridy = 0;


    logoPanel.add(logoLabel);
    //logoPanel.setPreferredSize(new Dimension(this.getWidth(), 300));
//    System.out.println(this.getWidth());
//    logoPanel.setPreferredSize(new Dimension(this.getWidth(), 500));


    this.add(logoPanel);

    //UPLOAD PANEL

    uploadPanel = new JPanel();
    uploadPanel.setBackground(MAIA_BG_COLOR);
    uploadPanel.setBorder(logoPanelBorder);
//    uploadPanel.setPreferredSize(new Dimension(900,200));

    JLabel uploadLabel = new JLabel("Upload");

    c.gridx = 0;
    c.gridy = 0;


    uploadPanel.add(uploadLabel);

    c.gridx = 1;
    c.gridy = 1;

    this.add(uploadPanel);

    c.gridx = 1;
    c.gridy = 1;

    c.gridx = 2;
    c.gridy = 1;

    c.gridx = 3;
    c.gridy = 1;

















  }




}
