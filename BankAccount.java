public class BankAccount {
    private String owner;
    private int Balance;
    public void setOwner(String Owner){
        this.owner = owner;
    }
    public String getOwner(){
        return owner;
    }
    public void setBalance(int Balance){
        this.Balance = Balance;
    }
    public int getBalance(){
        return Balance;
    }
    public int Deposite(int amount ) {
        Balance += amount;
        return Balance;
    }
        public int Withdraw(int amount){
            if (amount < Balance) {
                Balance -= amount;
            }
                return Balance;

        }
        public String toString(){
        return "Owner is " + getOwner() + ", the balance is "+ getBalance();
        }}
