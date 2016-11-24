package Task3_4;



/**
 * Created by Дима on 24.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        User newUser = new User("Dmitriy", 200, 2, "GlobalLogic", 800, "USD");

        newUser.paySalary(150);
        newUser.withdraw(10);
        System.out.println(newUser.companyNameLenght());
        newUser.monthIncreaser(7);
    }
}
