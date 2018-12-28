//import org.blockchain.model.ethereum.ERC20;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.ECKeyPair;
import org.web3j.crypto.WalletFile;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.Web3jService;
import org.web3j.protocol.core.DefaultBlockParameterNumber;
import org.web3j.protocol.core.Request;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
//import org.web3j.protocol.parity.Parity;
//import org.web3j.protocol.parity.methods.response.ParityExportAccount;
//import org.web3j.protocol.parity.methods.response.ParityTracesResponse;
//import org.web3j.protocol.parity.methods.response.Trace;
import org.web3j.tx.FastRawTransactionManager;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.DefaultGasProvider;
import org.web3j.tx.response.NoOpProcessor;

import java.math.BigInteger;
import java.util.List;

public class Web3JClient {
  private static Web3jService service = new HttpService("http://localhost:8545");
  Web3j web3 = Web3j.build(new HttpService("https://morden.infura.io/your-token")); //USING INFURA OUR TOKEN


  //When WEB3 is no longer needed: web3.shutdown()

  // create modules
  private static Web3j web3j = Web3j.build(service);
  //private static Parity parity = Parity.build(service);
  public static void main(String[] args) throws Exception {
    /**
     *  TEST DEPLOY AND CALL CONTRACT FUNCTION
     */
    // load private key into eckey to sign
    String privatekey = "***********************************";
    BigInteger privkey = new BigInteger(privatekey, 16);
    ECKeyPair ecKeyPair = ECKeyPair.create(privkey);
    Credentials credentials = Credentials.create(ecKeyPair);
    NoOpProcessor processor = new NoOpProcessor(web3j);

    //deploy new contract
    TransactionManager txManager = new FastRawTransactionManager(web3j, credentials, processor);

    //RemoteCall<ERC20> request = ERC20.deploy(web3j, txManager, DefaultGasProvider.GAS_PRICE, DefaultGasProvider.GAS_LIMIT);
    //ERC20 token = request.send();
   //String contractAddress = token.getDeployedAddress("3"); // 3 is ropsten testnet

    // load existing contract by address
    // ERC20 token = ERC20.load(contractAddress, web3j, txManager, DefaultGasProvider.GAS_PRICE, DefaultGasProvider.GAS_LIMIT);


    // create transaction transfer token to receiver
    String receiver = "0xa107483c8a16a58871182a48d4ba1fbbb6a*****";
    BigInteger value = new BigInteger("10000000000000");
    //TransactionReceipt receipt = token.transfer(receiver, value).send();
    // get transaction result
    //System.out.println(receipt.getTransactionHash());
  }
}
