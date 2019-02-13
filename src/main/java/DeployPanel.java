import org.web3j.tx.Contract;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.Border;


/**
 * NEED at LEAST 4 or 5 Panels
 */
public class DeployPanel extends JPanel {
  private Color MAIA_BG_COLOR;
  private Color MAIA_LOGO_COLOR;
  private JPanel topPanel;
  private JPanel bottomPanel;
  private JPanel logoPanel;
  private JPanel uploadPanel;
  private JPanel contractsPanel;
  private JPanel fieldsPanel;
  private JPanel resultPanel;
  private ArrayList<Contract> contracts;


  public DeployPanel() {

    this.contracts = new ArrayList<>();

    this.MAIA_BG_COLOR = new Color(40, 45, 51);
    this.MAIA_LOGO_COLOR = new Color(144, 195, 240);

//    this.setPreferredSize(new Dimension(1000, 1000));


    this.setBackground(MAIA_BG_COLOR);
//    this.setLayout(new GridBagLayout());
//    this.setLayout(new GridLayout(5, 0, 10, 10));


    Border border = BorderFactory.createMatteBorder(6, 6, 6, 6,
            MAIA_LOGO_COLOR);

    this.setBorder(BorderFactory.createTitledBorder(border, "Deploy a Smart Contract",
            0, 0, Font.getFont(Font.DIALOG),
            MAIA_LOGO_COLOR));

    GridBagConstraints c = new GridBagConstraints();


    c.insets.set(10,10,10,10);







    //--------------------------------------------------------------------------------------------
    //------------------------------------- Logo Panel setup -------------------------------------
    //--------------------------------------------------------------------------------------------

    Border logoPanelBorder = BorderFactory.createMatteBorder(2, 2, 2, 2,
            MAIA_LOGO_COLOR);

    topPanel = new JPanel();
    topPanel.setBackground(MAIA_BG_COLOR);
    topPanel.setBorder(logoPanelBorder);
    topPanel.setLayout(new GridLayout(0, 1, 10, 10));
    topPanel.setPreferredSize(new Dimension(975,300));

    bottomPanel = new JPanel();
    bottomPanel.setBackground(MAIA_BG_COLOR);
    bottomPanel.setBorder(logoPanelBorder);


    logoPanel = new JPanel();
    logoPanel.setBackground(MAIA_BG_COLOR);
    logoPanel.setBorder(logoPanelBorder);
    //logoPanel.setPreferredSize(new Dimension(900,100));

    JLabel logoLabel = new JLabel("Interact");

    c.gridx = 0;
    c.gridy = 0;


    logoPanel.add(logoLabel);
//    logoPanel.setPreferredSize(new Dimension(800, 100));
//    System.out.println(this.getWidth());
//    logoPanel.setPreferredSize(new Dimension(this.getWidth(), 500));


    topPanel.add(logoPanel);

    //Contracts Panel
    contractsPanel = new JPanel();
    contractsPanel.setBackground(MAIA_BG_COLOR);
    contractsPanel.setBorder(logoPanelBorder);
//    contractsPanel.setPreferredSize(new Dimension(900,50));

    JLabel contractsLabel = new JLabel("Upload");



    contractsPanel.add(contractsLabel);

    c.gridx = 0;
    c.gridy = 2;

    topPanel.add(contractsPanel);



    //Fields Panel
    fieldsPanel = new JPanel();
    fieldsPanel.setBackground(MAIA_BG_COLOR);
    fieldsPanel.setBorder(logoPanelBorder);
    //fieldsPanel.setPreferredSize(new Dimension(300,200));

    JLabel fieldsLabel = new JLabel("Upload");



    fieldsPanel.add(fieldsLabel);

    c.gridx = 0;
    c.gridy = 3;

    bottomPanel.add(fieldsPanel);

    this.add(topPanel);
    this.add(bottomPanel);

    //result Panel
//    resultPanel = new JPanel();
//    resultPanel.setBackground(MAIA_BG_COLOR);
//    resultPanel.setBorder(logoPanelBorder);
////    resultPanel.setPreferredSize(new Dimension(300,200));
//
//    JLabel resultLabel = new JLabel("Upload");
//
//
//
//    resultPanel.add(resultLabel);
//
//    c.gridx = 1;
//    c.gridy = 3;
//
//    this.add(resultPanel);

















  }




}
