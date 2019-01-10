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

//    CardLayout cl = (CardLayout) (homeView.getOpenView().getLayout());
//    cl.show(homeView.getOpenView(), "optionPanel");

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

      System.out.println("reached deploy button");

      //homeView.getOpenView().setLayout(new CardLayout());

//      CardLayout cl = (CardLayout) (homeView.getOpenView().getLayout());
      CardLayout cl = (CardLayout) (homeView.getOpenView().getLayout());
      cl.show(homeView.getOpenView(), "deployPanel");



    } else if(e.getActionCommand().equals("interactContract")) {
      System.out.println("reached Interact button");

//      CardLayout cl = (CardLayout) (homeView.getOpenView().getLayout());
      CardLayout cl = (CardLayout) (homeView.getOpenView().getLayout());
      cl.show(homeView.getOpenView(), "interactPanel");

    }

  }
}
