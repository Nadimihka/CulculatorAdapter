public class Main {
    public static void main(String[] args) {
        /*Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );*/

        Ints calc = new IntsCalculator();
        System.out.println("2+3=" + calc.sum(2, 3));
        System.out.println("2*3=" + calc.mult(2, 3));
        System.out.println("2 в 3 степени равно " + calc.pow(2, 3));
    }
}
