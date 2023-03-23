package FactoryMethodRealTime;

public class ForeignBankAccount extends BankAccountFactory{
    @Override
    public BankAccount createAccount(String typeOfAccount) {

        BankAccount bankAccount;

        if(typeOfAccount.equals("Personal")){
            bankAccount = new PersonalAccount();
        }else if(typeOfAccount.equals("Checking")){
            bankAccount = new CheckingAccount();
        }else if(typeOfAccount.equals("Business")){
            bankAccount = new BusinessAccount();
        }
        return null;
    }
}
