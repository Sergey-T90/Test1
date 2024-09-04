import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input: ");
        String input = scanner.nextLine();

        try {
            String result = calc(input);
            System.out.println("Output: " + result);
            }

        catch(Exception e) {
            System.err.println("throws Exception " + e.getMessage());
        }
    }

    public static String calc(String input)

            throws Exception {
        // Разбиваем строку на операнды и операцию
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            throw new Exception("//т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                    }

            int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new Exception("");
        }

        char operation = parts[1].charAt(0);
        int result;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;

            default:
                throw new
                        Exception("//Неподдерживаемый оператор");
        }
        return String.valueOf(result);
    }
}