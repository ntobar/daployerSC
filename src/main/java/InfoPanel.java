import org.web3j.tx.Contract;


import java.awt.*;

import javax.swing.*;

public class InfoPanel extends JPanel {
  private JFileChooser uploadContract;
  private JButton upload;
  private Color MAIA_BG_COLOR;
  private Color MAIA_LOGO_COLOR;
  private Contract contract;



  public InfoPanel() {



    this.setSize(new Dimension(500,200));

    this.MAIA_BG_COLOR = new Color(40, 45, 51);
    this.MAIA_LOGO_COLOR = new Color(144, 195, 240);

    uploadContract = new JFileChooser();
    uploadContract.setDialogTitle("Select Smart Contract");

    upload = new JButton("Upload Smart Contract");
    upload.setActionCommand("uploadSCButton");
    this.add(upload);




  }

  public JFileChooser getUploadContract() {
    return uploadContract;
  }

  public JButton getUpload() {
    return upload;
  }




}
