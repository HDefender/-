//вывести на консоль имя из элементов массива, используя String

public class Task1withString {
    public static void main(String[] args) {
        char name [] = new char [] {'B','U','L','A','T'}; //Создаем массив name, состоящий из букв БУЛАТ
        String str = ""; //заводим строку String

        for (char ch : name) { // цикл foreach для элементов массива name
            str += ch; // передаем строке значения массива из char в string
        }

        System.out.print (str); //выводим в консоль имя
    }
}

