import java.util.HashSet;

public class BankAccount {
    final int accountNumber;
    final int sortCode;

    public BankAccount(int accountNumber, int sortCode){
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (obj.getClass() != this.getClass()){
            return false;
        }
        BankAccount other = (BankAccount) obj;
        return (this.accountNumber == other.accountNumber)
                && (this.sortCode == other.sortCode);
    }

    public int hashCode(){
        return ((accountNumber * 4999) + (sortCode * 4993));
    }


    public static void main(String[] args){
        HashSet<BankAccount> bankAccounts = new HashSet<>();
        BankAccount acct1 = new BankAccount(111000,123456);
        BankAccount acct2 = new BankAccount(111000,123456);
        BankAccount acct3 = new BankAccount(123456,111000);
        bankAccounts.add(acct1);
        bankAccounts.add(acct2);
        bankAccounts.add(acct3);
        for (BankAccount bnkacct : bankAccounts){
            System.out.println("Account number: " + bnkacct.accountNumber +
                    " sort code: " + bnkacct.sortCode);
        }
    }
}
