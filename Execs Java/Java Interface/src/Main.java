import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();

        System.out.println("I implemented: AdvancedArithmetic");

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(myCalculator.divisor_sum(n));
    }
}