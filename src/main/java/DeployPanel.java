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

    this.setLayout(new GridBagLayout());
    c.insets.set(10,10,10,10);



    //--------------------------------------------------------------------------------------------
    //------------------------------------- Logo Panel setup -------------------------------------
    //--------------------------------------------------------------------------------------------

    Border logoPanelBorder = BorderFactory.createMatteBorder(2, 2, 2, 2,
            MAIA_LOGO_COLOR);


    logoPanel = new JPanel();
    logoPanel.setBackground(MAIA_BG_COLOR);
    logoPanel.setBorder(logoPanelBorder);
    logoPanel.setPreferredSize(new Dimension(900,100));

    JLabel logoLabel = new JLabel("Interact");

    c.gridx = 0;
    c.gridy = 0;


    logoPanel.add(logoLabel);
    //logoPanel.setPreferredSize(new Dimension(this.getWidth(), 300));
//    System.out.println(this.getWidth());
//    logoPanel.setPreferredSize(new Dimension(this.getWidth(), 500));


    this.add(logoPanel, c);

    //UPLOAD PANEL

    uploadPanel = new JPanel();
    uploadPanel.setBackground(MAIA_BG_COLOR);
    uploadPanel.setBorder(logoPanelBorder);
    uploadPanel.setPreferredSize(new Dimension(900,50));

    JLabel uploadLabel = new JLabel("Upload");



    uploadPanel.add(uploadLabel);

    c.gridx = 0;
    c.gridy = 1;

    this.add(uploadPanel, c);

    //Contracts Panel
    contractsPanel = new JPanel();
    contractsPanel.setBackground(MAIA_BG_COLOR);
    contractsPanel.setBorder(logoPanelBorder);
    contractsPanel.setPreferredSize(new Dimension(900,50));

    JLabel contractsLabel = new JLabel("Upload");



    contractsPanel.add(contractsLabel);

    c.gridx = 0;
    c.gridy = 2;

    this.add(contractsPanel, c);



    //Fields Panel
    fieldsPanel = new JPanel();
    fieldsPanel.setBackground(MAIA_BG_COLOR);
    fieldsPanel.setBorder(logoPanelBorder);
//    fieldsPanel.setPreferredSize(new Dimension(300,200));

    JLabel fieldsLabel = new JLabel("Upload");



    fieldsPanel.add(fieldsLabel);

    c.gridx = 0;
    c.gridy = 3;

    this.add(fieldsPanel, c);

    //result Panel
    resultPanel = new JPanel();
    resultPanel.setBackground(MAIA_BG_COLOR);
    resultPanel.setBorder(logoPanelBorder);
//    resultPanel.setPreferredSize(new Dimension(300,200));

    JLabel resultLabel = new JLabel("Upload");



    resultPanel.add(resultLabel);

    c.gridx = 1;
    c.gridy = 3;

    this.add(resultPanel, c);

















  }




}
