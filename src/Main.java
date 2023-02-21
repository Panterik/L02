import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Введите два вещественных числа:");
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        double sum = 0.0;
        sum = 3 * Math.pow(Math.cos(first - (Math.PI / 6)), 2) / (0.5 + Math.sin(Math.pow(second, 2)));
        System.out.println("Ответ: " + sum);
    }
}