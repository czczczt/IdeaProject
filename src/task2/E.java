package task2;

import java.util.Scanner;

public class E {
    public static double withoutNds(double price, double percent) {
        return (price / (100 + percent)) * 100;
    }

    public static double read(int type) {
        Scanner scanner = new Scanner(System.in);
        double num = 0;
        boolean f = false;
        if (type == 1) {
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                return -1;
            }
        }
        while (!f) {
            try {
                num = scanner.nextDouble();
                if (num > 0) {
                    f = true;
                } else {
                    System.out.println("Число не может быть отрицательным или равным нулю");
                }
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Введите число");
            }
        }
        return num;
    }

    public static void main(String[] args) {
        String text = "Введите команду (1 - расчёт, 2 - информация, 3 - выход)";
        System.out.println(text);
        while (true) {
            int com = (int) read(1);
            switch (com) {
                case 1 -> {
                    System.out.print("Введите цену товара: ");
                    double price = read(2);

                    System.out.print("Введите НДС: ");
                    double percent = read(2);

                    double without = withoutNds(price, percent);
                    System.out.printf("Стоимость товара: %.2f%n", without);
                    System.out.println(text);
                }
                case 2 -> {
                    System.out.println("Эта программа рассчитывает стоимость товара без НДС");
                    System.out.println(text);
                }
                case 3 -> System.exit(0);
                default -> System.out.println("Команда не распознана. Повторите ввод");
            }
        }
    }
}
// Доработайте программу из лабораторной работы 1:
// 1. добавьте главное меню на основе цикла while: выполнить расчёт, информация о программе, информация о разработчике, выход;
// 2. при ошибочном вводе предлагайте повторить ввод до получения корректных данных или команды выхода;
// 3. выполните декомпозицию программы и реализуйте статические методы для отдельных частей.
