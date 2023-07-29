import java.util.Scanner;

public class Calculator {
    public String[] values;
    public int result;

    public void ReceiveInput() {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();
        values = input.split(" ");

        result = Integer.parseInt(values[0]);
    }

    public int calculate(int result) {
        for(int i = 1; i < values.length; i += 2) {
            switch (values[i]) {
                case "+":
                    result += Integer.parseInt(values[i + 1]);
                    break;
                case "-":
                    result -= Integer.parseInt(values[i + 1]);
                    break;
                case "*":
                    result *= Integer.parseInt(values[i + 1]);
                    break;
                case "/":
                    result /= Integer.parseInt(values[i + 1]);
                    break;
                default:
                    break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.ReceiveInput();
        calculator.result = calculator.calculate(calculator.result);
        System.out.println(calculator.result);
    }
}
