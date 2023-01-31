package ru.netology;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );

        Ints intsCalc = new IntsCalculator();
        System.out.println("sum: " + intsCalc.sum(2, 2));
        System.out.println("sum: " + intsCalc.sum(10, 22));
        System.out.println("pow: " + intsCalc.pow(2, 10));
        System.out.println("mult: " + intsCalc.mult(2, 5));
    }
}