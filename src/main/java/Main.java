import javax.swing.*;

public class Main {

  //solcjs  ./src/main/java/Mortal.sol --bin --abi --optimize -o ./src/main/java

  //sudo /Users/nicolastobar/desktop/web3j/web3j-3.6.0/bin/web3j solidity generate ./src/main/java/Mortal.bin ./src/main/java/Mortal.abi -o ./src/main/java -p com.tobar
  //Cards.ICard card = new Cards.Card();


  public static void main(String[] args) {



    MainFrame mf = new MainFrame();
    Controller controller = new Controller(mf);

    mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mf.pack();
    mf.setVisible(true);


  }

}
