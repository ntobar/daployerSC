import org.web3j.protocol.Web3j;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

import static com.sun.xml.internal.bind.api.impl.NameConverter.smart;

public final class SmartContracts extends Contract {
  protected SmartContracts(String contractBinary, String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider gasProvider) {
    super(contractBinary, contractAddress, web3j, transactionManager, gasProvider);
  }


  //org.web3j.codegen.SolidityFunctionWrapperGenerator -b /path/to/<smart-contract>.bin -a /path/to/<smart-contract>.abi -o /path/to/src/main/java -p com.your.organisation.name



}
