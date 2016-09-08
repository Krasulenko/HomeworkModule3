package homework34;


public class Main {
    public static void main(String[] args) {
        User user = new User("Michael", 3000, 24, "Oracle", 4000, "USD");

        System.out.println("Balance" + " " + user.getBalance());
        user.paySalary();
        System.out.println("Balance after sallary" + " " + user.getBalance());

        System.out.println("Balance after withdrawal" + " " + user.withdraw(1600));
        
        System.out.println("Balance" + " " + user.getBalance());

        System.out.println("Companyname length" + " " + user.companyNameLength());

        System.out.println("Months of employment" + " " + user.monthIncreaser(6));
    }
}
