import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        System.out.println(name + ", введите номер варианта для рассчёта выражения:");
        int variant = sc.nextInt();

        double a1,a2,a3,a4,a5, sum = 0.0;

        switch (variant) {
            case 1 -> {
                System.out.println(name + ", введите 5 чисел");
                a1 = sc.nextDouble();
                a2 = sc.nextDouble();
                a3 = sc.nextDouble();
                a4 = sc.nextDouble();
                a5 = sc.nextDouble();
                sum = 5*Math.pow(a1, a2*a5) / (a3 + a4) - Math.sqrt(Math.abs(Math.cos(Math.pow(a5, 3))));
            }
            case 2 -> {
                System.out.println(name + ", введите 4 числа");
                a1 = sc.nextDouble();
                a2 = sc.nextDouble();
                a3 = sc.nextDouble();
                a4 = sc.nextDouble();
                sum = Math.abs(a1 - a2) / Math.pow(1 + 2*a1, a3) - Math.pow(Math.E, Math.sqrt(1 + a4));
            }
            case 3 -> {
                System.out.println(name + ", введите 4 числа");
                a1 = sc.nextDouble();
                a2 = sc.nextDouble();
                a3 = sc.nextDouble();
                a4 = sc.nextDouble();
                sum = Math.sqrt(a1 + a2*a3 + a4*Math.pow(Math.abs(Math.sin(a3)), 1.0/3.0));
            }
            case 4 -> {
                System.out.println(name + ", введите 2 числа");
                a1 = sc.nextDouble();
                a2 = sc.nextDouble();
                sum = Math.log(Math.pow(a1, 7)) + Math.atan(Math.pow(a2, 2)) + Math.PI / Math.sqrt(Math.abs(a1 + a2));
            }
            case 5 -> {
                System.out.println(name + ", введите 5 чисел");
                a1 = sc.nextDouble();
                a2 = sc.nextDouble();
                a3 = sc.nextDouble();
                a4 = sc.nextDouble();
                a5 = sc.nextDouble();
                sum = Math.pow((Math.pow(a1 + a2, 2) / (a3 + a4)) + Math.pow(Math.E, Math.sqrt(a5 + 1)) , 1.0/5.0 );
            }
            case 6 -> {
                System.out.println(name + ", введите 1 число");
                a1 = sc.nextDouble();
                sum = Math.pow(Math.E, (2 * Math.sin(4 * a1) + Math.pow(Math.cos(Math.pow(a1, 2)), 2)) / (3 * a1));
            }
            case 7 -> {
                System.out.println(name + ", введите 1 число");
                a1 = sc.nextDouble();
                sum = (1.0 / 4.0) * ( ((1 + Math.pow(a1, 2)) / (1 - a1)) + 1.0/2.0 * Math.tan(a1));
            }
        }

        System.out.println("Результат: " + sum);
    }
}