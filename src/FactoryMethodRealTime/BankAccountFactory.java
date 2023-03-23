package FactoryMethodRealTime;

public abstract class BankAccountFactory {
    public String name;
    public String branchName;
    public String IFSCCode;
    public String nationality;

    public BankAccount openAccount(String typeOfAccount){

        //BankAccount openAccount = createAccount();
        return null;

    }

    public abstract BankAccount createAccount(String typeOfAccount);
}
