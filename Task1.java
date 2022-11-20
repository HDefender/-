import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner t1 = new Scanner(System.in);
        int a = t1.nextInt();
        int fact = 1;// задаю значение факториала равное 1

        if (a < 0) { //объявляю условие, что введенное число не может быть отрицательным
            System.out.println("This is negative number!");
        }
        else { // в случае если введенное число неотрицательное запускаем цикл
            for (int i = 1; i <= a; i++) { //условие итерации от 1 до а с увеличением на единицу
                fact = fact * i; //факториал равен факториалу, умноженному на текущую итерацию
            }
            System.out.println (fact);

        }
    }

}

