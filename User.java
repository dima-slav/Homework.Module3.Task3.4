package Task3_4;

/**
 * Created by Дима on 24.11.2016.
 */
public class User {

        private String name;
        private int balance;
        private int monthsOfEmployment;
        private String companyName;
        private int salary;
        private String currency;

        public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
            this.name = name;
            this.balance = balance;
            this.monthsOfEmployment = monthsOfEmployment;
            this.companyName = companyName;
            this.salary = salary;
            this.currency = currency;

        }
        void paySalary(){
            balance+=salary;
        }

        double withdraw(int summ){
            double withdraw;
            double comission;
            if (summ < 1000) {
                comission = summ * 0.05;

            } else {
                comission = summ * 0.1;


            }
            withdraw = summ + comission;
            double bal = (double) balance;
            bal = bal - withdraw;
            return bal;
        }

    void companyNameLengt() {
        System.out.println(companyName.length());
    }

    void monthIncreaser(int addMonth) {
        monthsOfEmployment += addMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}