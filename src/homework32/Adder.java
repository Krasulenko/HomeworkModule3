package homework32;

public class Adder extends Arithmetic{
    protected boolean check(Integer a, Integer b){
        boolean check = false;
        if (a>=b) check = true;
        return check;
    }

}
