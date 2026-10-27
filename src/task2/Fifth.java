import java.util.Scanner;

public class Fifth {
    public static double withoutNds(double price, int percent) {
        return (price / (100 + percent)) * 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "Введите команду (1 - расчёт, 2 - информация, 3 - выход)";
        int com = 0;

        while (true) {
            System.out.println(text);

            boolean f = false;
            while (!f) {
                try {
                    com = scanner.nextInt();
                    f = true;
                } catch (Exception e) {
                    scanner.nextLine();
                    System.out.println("Введите число");
                }
            }

            switch (com) {
                case 1 -> {
                    System.out.print("Введите цену товара: ");
                    double price = scanner.nextDouble();
                    while (price <= 0) {
                        System.out.println("Цена не может быть отрицательной или равной нулю");
                        System.out.print("Введите цену товара: ");
                        price = scanner.nextDouble();
                    }

                    System.out.print("Введите НДС: ");
                    int percent = scanner.nextInt();
                    while (percent < 0) {
                        System.out.println("НДС не может быть отрицательным");
                        System.out.print("Введите НДС: ");
                        percent = scanner.nextInt();
                    }
                    double without = withoutNds(price, percent);
                    System.out.printf("Стоимость товара: %.2f%n", without);
                }
                case 2 -> System.out.println("Эта программа расчитывает стоимость товара без НДС");
                case 3 -> System.exit(0);
                default -> System.out.println("Команда не распознана");
            }
        }
    }
}
// Доработайте программу из лабораторной работы 1:
// 1. добавьте главное меню на основе цикла while: выполнить расчёт, информация о программе, информация о разработчике, выход;
// 2. при ошибочном вводе предлагайте повторить ввод до получения корректных данных или команды выхода;
// 3. выполните декомпозицию программы и реализуйте статические методы для отдельных частей.
