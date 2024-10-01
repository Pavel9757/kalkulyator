import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class MainApp {
    public static void main(String[] arqs) {
        Scanner sc = new Scanner(System.in);
System.out.println("Введите число");
String name = sc.nextLine();
        try {
            String result = calc(name);
            System.out.println("Результат: " + result);
        } catch (Exception error) {
            System.out.println("Ошибка: " + error.getMessage());
        }

    }
    public static String calc(String input){
        int a, b, result = 0;

        String[] symbols = input.split(" ");

        if (symbols.length != 3){
            throw new IllegalArgumentException("Слишком длинный ввод (+, -, /, *) с пробелами. ");
        }
        a = parseInt(symbols[0]);
        b = parseInt(symbols[2]);
        String operation = symbols[1];

        if (a < 1 || a > 10 || b < 1 || b > 10){
            throw new IllegalArgumentException("Числа должны быть от 1 до 10 включительно.");
        }
        switch (operation){
            case "+":
                result = a + b ;
                break;
            case "-":
                result = a - b ;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Строка не является поддерживаемой математической операцией.");
        }



        return String.valueOf(result);
    }
}

