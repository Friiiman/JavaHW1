import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {

        // Task1();
        // Task2();
        Task3();
    }

    static void Task1(){
        // Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
        // n! (произведение чисел от 1 до n)

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int num = iScanner.nextInt();
        iScanner.close();

        System.out.println("\nN-ое треугольного числа " + num + ":");
        for(int i = 1; i <= num; i++){
            double triangle = 0.5 * i * (i + 1);
            System.out.print((int)triangle + " ");
        }

        System.out.println("\nФакториал числа " + num + ":");
        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }

    static void Task2(){
        // Вывести все простые числа от 1 до 1000

        for(int i = 1; i <= 1000; i++){
            int count = 0;
            for(int j = 2; j <= i && count < 2; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count < 2){
                System.out.println(i);
            }
        }
    }

    static void Task3(){
        // Реализовать простой калькулятор

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите два числа через пробел(дробная часть отделяется запятой): ");
        double num1 = iScanner.nextDouble();
        double num2 = iScanner.nextDouble();
        double result = 0;
        System.out.printf("\nВведите операцию (+, -, *, /): ");
        char operator = iScanner.next().charAt(0);
        switch(operator) {
            case '+': result = num1 + num2;
                break;
            case '-': result = num1 - num2;
                break;
            case '*': result = num1 * num2;
                break;
            case '/': result = num1 / num2;
                break;
            default:  System.out.printf("Введен неверный оператор");
            return;
        }
        System.out.printf("\nРезультат:\n");
        System.out.printf(num1 + " " + operator + " " + num2 + " = " + result);
    }
}