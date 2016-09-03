package homework32;

public class Main {
    public static void main(String[] args) {
        int a = 19;
        int b = 39;

        Adder adder = new Adder();

        System.out.println(adder.add(a,b));
        System.out.println( adder.check(a,b));

    }
}
