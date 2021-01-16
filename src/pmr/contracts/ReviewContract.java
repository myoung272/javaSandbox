

package pmr.contracts;


public class ReviewContract {
    private String  solicitationNumber;
    private String  contractName;
    private String  contractNumber;
    
   public ReviewContract(String solicitationNumber, String contractName, String contractNumber) {
       this.solicitationNumber = solicitationNumber;
       this.contractName = contractName;
       this.contractNumber = contractNumber;
   }

    /**
     * @return the solicitationNumber
     */
    public String getSolicitationNumber() {
        return solicitationNumber;
    }

    /**
     * @param solicitationNumber the solicitationNumber to set
     */
    public void setSolicitationNumber(String solicitationNumber) {
        this.solicitationNumber = solicitationNumber;
    }

    /**
     * @return the contractName
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * @param contractName the contractName to set
     */
    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    /**
     * @return the contractNumber
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * @param contractNumber the contractNumber to set
     */
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }
}
