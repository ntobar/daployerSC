
import org.web3j.tx.Contract;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.BevelBorder;

public class MainFrame extends JFrame {
  private OpenView openView;
  private InfoPanel infoPanel;
  private DeployPanel deployPanel;
  private InteractPanel interactPanel;
  private ArrayList<Contract> contracts;
  private Color MAIA_BG_COLOR;
  private Color MAIA_LOGO_COLOR;



  public MainFrame() {


    //Contracts
    this.contracts = new ArrayList<>();


    this.setTitle("- daployer S-C -");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setPreferredSize(new Dimension(1000, 1000));

    this.MAIA_BG_COLOR = new Color(40, 45, 51);
    this.MAIA_LOGO_COLOR = new Color(144, 195, 240);

    this.setBackground(MAIA_BG_COLOR);






    openView = new OpenView();
    this.add(openView);

    //infoPanel = new InfoPanel();

    //this.add(infoPanel);






  }

  public InfoPanel getInfoPanel() {
    return infoPanel;
  }

  public DeployPanel getDeployPanel() {
    return deployPanel;
  }

  public InteractPanel getInteractPanel() {
    return interactPanel;
  }


  public OpenView getOpenView() {
    return openView;
  }

  public void setActionListener(ActionListener listen) {

    //infoPanel.getUpload().addActionListener(listen);

    openView.getDeployButton().addActionListener(listen);
    openView.getInteractButton().addActionListener(listen);



  }

}
