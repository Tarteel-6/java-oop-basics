import java.util.Scanner;
public class Tester {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       Dog Dog1 = new Dog();
       Dog1.name = "Doobee";
       Dog1.age = 6;
        Dog1.ShowInfo();

        Circle cric = new Circle();
        cric.radius = 6.24;
        cric.TheFinalValue();

        Book MyLove = new Book();
        MyLove.title = "My Special 14 ";
        MyLove.pages = 400;
        MyLove.ShowRes();

        BankAccount Bala = new BankAccount();
        Bala.owner = "Tarteel";
        Bala.Balance = 624;
        Bala.Deposite(207);
        Bala.Withdraw(240);
        Bala.Withdraw(700);

        Light Li = new Light();
        System.out.println(" if the light is On enter true but else enter false :");
        Li.isOn = sc.nextBoolean();
        Li.turnOn();
        Li.turnOff();



















    }
}
