// 2. Написать программу возрващающую число, которе без остатка делится на сумму цифр этого числа.

import java.util.Random;

public class second {
    public static void main(String[] args) {
        while (Calc() == true) { // Бесконечный цикл с выходом при условии "number%sum_of_digit == 0"
        }
    }

    public static boolean Calc() { // Функция
        int sum_of_digit = 0, num, number;
        Random r = new Random();
        num = r.nextInt((200 - 10) + 1) + 10; // Случайное число от 10 до 200
        number = num;
        while (num > 0) {
            sum_of_digit += num % 10;
            num = num / 10;
        }
        if (number % sum_of_digit == 0) {
            System.out.println(number);
            return false;
        } else {
            return true;
        }
    }
}