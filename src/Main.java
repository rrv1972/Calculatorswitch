import java.util.Arrays;
import java.util.Scanner;


public class Main {
    private static String input;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите арифметическое действие (+,-,/,*) с двумя числами арабского или римского исчисления от 1 до 10 включительно и нажмите ввод: ");
        String input = in.nextLine();
        String resultend = calc(input);
        System.out.println("Результат арифметического действия:" + resultend);
    }

        public static String calc(String input) {
            int i = 0, number1, number2;
            char operation = '0';
            int result = 0;
            char[] strmass = new char[10];
           String[] z = input.split("[+-/*]");
           System.out.println(Arrays.toString(z));
           int v = z.length;
           if  (v > 2) {
           return "Не верное арифметическое действие ";
           }
            for (i = 0; i < input.length(); i++) {
                strmass[i] = input.charAt(i);
                if (strmass[i] == '+') {
                    operation = '+';
                }
                if (strmass[i] == '-') {
                    operation = '-';
                }
                if (strmass[i] == '*') {
                    operation = '*';
                }
                if (strmass[i] == '/') {
                    operation = '/';
                } //else { System.out.println("Ошибка ввода данных");//прерывание исключение
            }
            if (operation =='0') {/*System.out.println("ошибка ввода нет арифмет знака");*/
            return "Отсутствует арифметическая опреация";}// прерывание через исключение
            String strmassString = String.valueOf(strmass);
            String[] numbers = strmassString.split("[+-/*]");
            String num00 = numbers[0].trim();
            String num01 = numbers[1].trim();
            number1 = romanToarab(num00);
            number2 = romanToarab(num01);
            if (0 < number1 && 0 < number2) {
                result = couNter(number1, number2, operation);
            if (result < 0) {
                return "Результат с Римскими числами отрицательный";//  прерывание исключение сделать
            } else {
                String result3 = arabToroma(result);
                return result3;
                // System.out.println("Результат для римских цифр :" + result3);}
            } }
            if ((number1 < 0 && number2 > 0) || (number2 < 0 && number1 > 0)) {
                        return "Ошибка ввода данных";// прерывание исключение
                    }
                    number1 = Integer.parseInt(num00);
                    number2 = Integer.parseInt(num01);
                    if (number1 >= 1 && number1 <= 10 && number2 >= 1 && number2 <= 10) {
                       result = couNter(number1, number2, operation);
                       String result3 = String.valueOf(result);
                       return result3;
                    }
    return "Ошибка ввода данных";// прерывание через исключение
    }



public static int couNter(int num1, int num2, char oper) {
    int result1 = 1;
    switch (oper) {
        case ('+'):
            result1 = num1 + num2;
            break;
        case ('-'):
            result1 = num1 - num2;
            break;
        case ('/'):
            result1 = num1 / num2;
            break;
        case ('*'):
            result1 = num1 * num2;
            break;
    }
    return result1;
}

    public static int romanToarab(String x) {
            if (x.equals("I")) {
                return 1;
            } else if (x.equals("II")) {
                return 2;
            } else if (x.equals("III")) {
                return 3;
            } else if (x.equals("IV")) {
                return 4;
            } else if (x.equals("V")) {
                return 5;
            } else if (x.equals("VI")) {
                return 6;
            } else if (x.equals("VII")) {
                return 7;
            } else if (x.equals("VIII")) {
                return 8;
            } else if (x.equals("IX")) {
                return 9;
            } else if (x.equals("X")) {
                return 10;
            } else { System.out.println("------------");

        }
        return -1;
    }
    public static String arabToroma(int x) {
        String[] res = {"ошибка", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        String result3 = res[x];
        return result3;
    }


}

