public class Tester {
    public static void main(String[] args){

       Dog Dog1 = new Dog();
       Dog1.setName("Doobe");
       Dog1.setAge(6);
       System.out.println(Dog1);

        Circle cric = new Circle();
        cric.setRadius(6.24);
        cric.toString();
        System.out.println(cric);

        Book MyLove = new Book();
        MyLove.setTitle("My special 14 ");
        MyLove.setPages(600);
        MyLove.toString();
        System.out.println(MyLove);

        BankAccount Bala = new BankAccount();
        Bala.setOwner("Tarteel");
        Bala.setBalance(600);
        Bala.Deposite(207);
        Bala.Withdraw(240);
        Bala.Withdraw(700);
        System.out.println(Bala);

        Light Li = new Light();
        Li.setIsOn(true);
        Li.turnOff();
        Li.turnOn();
        Li.toString();
        System.out.println(Li);

        Classroom classroom1 = new Classroom();
        classroom1.setStudents(new String [] {"Alice", "Bob" , "Charlie"});
        classroom1.toString();
        System.out.println(classroom1);

        Counter counter1 = new Counter();
        counter1.setCount(600);
        counter1.increase();
        counter1.decrease();
        counter1.toString();
        System.out.println(counter1);



















    }
}
