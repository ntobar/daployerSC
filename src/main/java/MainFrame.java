
import org.web3j.tx.Contract;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class MainFrame extends JFrame {
  private InfoPanel infoPanel;
  private DeployPanel deployPanel;
  private InteractPanel interactPanel;
  private ArrayList<Contract> contracts;



  public MainFrame() {


    //Contracts
    this.contracts = new ArrayList<>();


    this.setTitle("- daployer S-C -");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setPreferredSize(new Dimension(1000, 1000));


    infoPanel = new InfoPanel();

    this.add(infoPanel);






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


  public void setActionListener(ActionListener listen) {

    infoPanel.getUpload().addActionListener(listen);

  }

}
