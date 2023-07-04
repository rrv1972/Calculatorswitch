import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int i = 0, number1, number2;
        char operation = '0';
        int result = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите арифметическое действие (+,-,/,*) с двумя числами арабского или римского исчисления от 1 до 10 включительно и нажмите ввод: ");
        String str = in.nextLine();
        char[] strmass = new char[10];
        for (i = 0; i < str.length(); i++) {
            strmass[i] = str.charAt(i);
            if (strmass[i] =='+') {
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
            }
        }
        if (operation == '0') {
            System.out.println("Ошибка ввода данных");
        return;}
        String strmassString = String.valueOf(strmass);
        String[] numbers = strmassString.split("[+-/*]");
        String num00 = numbers[0].trim();
        String num01 = numbers[1].trim();
        number1 = romanToarab(num00);
        number2 = romanToarab(num01);
        if (0 < number1 && 0 < number2) {
            result = couNter (number1, number2, operation);
            if (result < 0) {
                System.out.println("Результат действий с римскими числами отрицательный ");
            }
            else {
                String result2 = arabToroma(result);
                System.out.println("Результат для римских цифр :" + result2);}

        } else {if ((number1 < 0 && number2 >0) || (number2 < 0 && number1>0)) {
            System.out.println("Ошибка ввода данных");
            return;
        }
           number1 = Integer.parseInt(num00);
           number2 = Integer.parseInt(num01);
           if (number1 >= 1 && number1 <= 10 && number2 >=1 && number2 <= 10) {
           result = couNter(number1, number2, operation);
            System.out.println("Результат для арабских цифр :" + result);}
           else {System.out.println("Ошибка ввода данных");
           }
        }
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

        /*switch (x) {
            case (1):
                return ("I");
            case (2):
                return ("II");
            case (3):
                return ("III");
            case (4):
                return ("IV");
            case (5):
                return ("V");
            case (6):
                return ("VI");
            case (7):
                return ("VII");
            case (8):
                return ("VIII");
            case (9):
                return ("IX");
            case (10):
                return ("X");
            case (11):
                return ("XI");
            case (12):
            return ("XII");
            case (13):
                return ("XIII");
            case (14):
                return ("XIV");
            case (15):
                return ("XV");
            case (16):
                return ("XVI");
            case (17):
                return ("XVII");
            case (18):
                return ("XVIII");
            case (19):
                return ("XIX");
            case (20):
                return ("XX");

        }
        return ("0");*/
    }
    }

