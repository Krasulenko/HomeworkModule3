package homework34;

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

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    void paySalary() {
        this.balance = this.balance + salary;
    }

    int withdraw(int summ) {
        double commission;
        int balanceAfterWithdrawal;
        if (summ < 1000) commission = 0.05;
        else commission = 0.1;
        balanceAfterWithdrawal = this.balance - (int) (summ + summ * commission);
        if (balanceAfterWithdrawal < 0) System.out.println("Not enough money on balance");
        else this.balance = balanceAfterWithdrawal;
        return this.balance;
    }

    int companyNameLength() {
        return this.companyName.length();
    }

    int monthIncreaser(int addMonth) {
        return this.monthsOfEmployment + addMonth;
    }
}
