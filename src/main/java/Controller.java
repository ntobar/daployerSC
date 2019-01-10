import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class Controller implements ActionListener {
  private MainFrame homeView;

  public Controller(MainFrame homeView) {
    this.homeView = homeView;
    this.homeView.setActionListener(this);
  }



  @Override
  public void actionPerformed(ActionEvent e) {

    if(e.getActionCommand().equals("uploadSCButton")) {


      int returnVal = homeView.getInfoPanel().getUploadContract().showOpenDialog(homeView);

      if (returnVal == JFileChooser.APPROVE_OPTION) {

        File file = homeView.getInfoPanel().getUploadContract().getSelectedFile();



        //homeView.getCreatePanel().getCard().set


        //homeView.getCreatePanel().getCard().setBackgroundImage(file.getPath());


        log.append("Opening: " + file.getName() + "." + "\n");
      } else {
        log.append("Open command cancelled by user." + "/n");
      }


    } else if(e.getActionCommand().equals("deployContract")) {

      //homeView.getOpenView().setLayout(new CardLayout());

//      CardLayout cl = (CardLayout) (homeView.getOpenView().getLayout());
      CardLayout cl = (CardLayout) (homeView.getDeployPanel().getLayout());
      cl.show(homeView.getDeployPanel(), "deployPanel");



    } else if(e.getActionCommand().equals("interactContract")) {

//      CardLayout cl = (CardLayout) (homeView.getOpenView().getLayout());
      CardLayout cl = (CardLayout) (homeView.getInteractPanel().getLayout());
      cl.show(homeView.getInteractPanel(), "interactPanel");

    }

  }
}
