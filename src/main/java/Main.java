import babysitter.WageCalculator;
import fizz_buzz.FizzBuzz;

public class Main {

    public static void main(String args[]) {


        WageCalculator wageCalculator = new WageCalculator();
        double calculate = wageCalculator.calculateShiftWage("17", "18", 20);

        System.out.println("Calculate " + calculate);


    }

}