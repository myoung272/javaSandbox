

package pmr.contracts;

import java.util.ArrayList;
import java.util.List;


public class AddContracts {
    
    public static void main(String args[]) {
        
        // from DB
        List<ReviewContract> currentContracts = new ArrayList<>();
        // from ui
        List<ReviewContract> newContracts = new ArrayList<>();
        
        // ReviewContract(String solicitationNumber, String contractName, String contractNumber)
        
        // from DB only
        currentContracts.add(new ReviewContract("W91QEK-16-A-2222", "W91QEK-18-4-1234", "W91QEK-18-4-1234"));
        
        // from UI and DB
        newContracts.add(new ReviewContract("W91QEK-17-R-0025", "W91QWK-18-2-0001", "W91QWK-18-2-0001"));
        newContracts.add(new ReviewContract("W91QEK-17-R-0025", "W91QWK-18-2-0002", "W91QWK-18-2-0002"));
        newContracts.add(new ReviewContract("W91QEK-17-R-0025", "W91QWK-18-2-0003", "W91QWK-18-2-0003"));
        newContracts.add(new ReviewContract("W91QEK-17-R-0025", "W91QWK-18-2-0004", "W91QWK-18-2-0004"));
        newContracts.add(new ReviewContract("W91QEK-16-A-2222", "W91QEK-18-4-1234", "W91QEK-18-4-1234"));
        
        
        newContracts.forEach((ReviewContract newContract) -> {
            
             ReviewContract currentContract = currentContracts.stream()
                     .filter(c -> 
                      // find existing CAR same solicitation number and same contract number (if exists)
                            (newContract.getSolicitationNumber() != null && 
                                    ((newContract.getContractNumber() == null && newContract.getSolicitationNumber().equals(c.getContractName())) || 
                                            (c.getContractNumber() != null && newContract.getContractNumber() != null 
                                                    
                                                    && newContract.getContractNumber().equals(c.getContractNumber()) 
                                                    && newContract.getSolicitationNumber().equals(c.getSolicitationNumber()))) ||
                                            
                                            (c.getContractNumber() == null && newContract.getContractNumber() == null 
                                                    && newContract.getSolicitationNumber().equals(c.getSolicitationNumber()))))
                                                     .findFirst()
                                                  .orElse(null);
             
             System.out.println(currentContract.getContractName());
        
        }); // end outer lambda
        }
    }


