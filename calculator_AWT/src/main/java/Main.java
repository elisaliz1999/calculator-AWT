import models.MyCalc;

public class Main {
    public static void main(String[] args) {
        if (args[0] != null) {
            System.out.println(args[0]);
        }
        MyCalc calc = new MyCalc();
    }
}
