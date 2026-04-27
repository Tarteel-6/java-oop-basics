public class BankAccount {
    public String owner;
    public int Balance;
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
        return "Owner is " + owner + ", the balance is "+ Balance;
        }


}
