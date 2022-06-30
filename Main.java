package Les2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Дано расстояние L в сантиметрах. Используя операцию деления
        //нацело, найти количество полных метров в нем (1 метр = 100 см).
        /*
       Scanner in = new Scanner(System.in);
       System.out.print("Введите целое число - кол-во сантиметров:");
       int L = in.nextInt();
       System.out.println(L/100 + " метров");

         */
        /*
       Scanner in = new Scanner(System.in);
       System.out.print("Введите число байтов: ");
       int bytes = in.nextInt();
       System.out.println(bytes/1024 + " килобайтов");
                */
        //Integer6◦
        //. Дано двузначное число. Вывести вначале его левую цифру (десятки), а затем — его правую цифру (единицы). Для нахождения десятков
        //использовать операцию деления нацело, для нахождения единиц — операцию взятия остатка от деления.
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите двузначное число: ");
        int L = in.nextInt();
        System.out.println(L/10 + " десятков");
        System.out.println(L%10 + " единиц");

         */

        //Integer7◦
        //. Дано двузначное число. Найти сумму и произведение его цифр.
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите двузначное число: ");
        int L = in.nextInt();
        System.out.println(L/10 + L%10 + " сумма цифр");
        System.out.println(L/10 - L%10 + " произведение цифр");

         */

        //Integer8◦
        //. Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа
        /*

        Scanner in = new Scanner(System.in);
        System.out.print("Введите двузначное число: ");
        int L = in.nextInt();
        System.out.print(L%10*10+L/10);

         */




        //Integer9◦
        //. Дано трехзначное число. Используя одну операцию деления нацело,
        //вывести первую цифру данного числа (сотни).
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int L = in.nextInt();
        System.out.print(L/100);

         */

        //Integer10◦
        //. Дано трехзначное число. Вывести вначале его последнюю цифру
        //(единицы), а затем — его среднюю цифру (десятки).
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int L = in.nextInt();
        System.out.print(L%10);
        int X = L / 10;
        System.out.print(X%10);

        Scanner in = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int number = in.nextInt();
        System.out.print("Единицы: " + number%10);
        int des = (number/10) % 10 // (number%100) / 10;
        System.out.print("Десятки: " + des);

         */

        // Integer11◦
        //. Дано трехзначное число. Найти сумму и произведение его цифр.
        /*

        Scanner in = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int L = in.nextInt();
        int A = L/100;
        int C = L%10;
        int B = (L / 10)%10;
        System.out.println("Сумма цифр: " + (A+B+C));
        System.out.print("Произведение цифр: " + (A*B*C));

         */

        //Integer12◦
        //. Дано трехзначное число. Вывести число, полученное при прочтении исходного числа справа налево.
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int L = in.nextInt();
        int sot = L/100;
        int ed = L%10;
        int des = (L / 10)%10;
        int res = 100*ed + 10*des + sot;
        System.out.println("Число в обратном порядке: " + res);

         */

        //Integer13◦
        //. Дано трехзначное число. В нем зачеркнули первую слева цифру и
        //приписали ее справа. Вывести полученное число.
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int L = in.nextInt();
        int sot = L/100;
        int ed = L%10;
        int des = (L / 10)%10;
        int res = 100*des+10*ed+sot;
        System.out.println("Результат: " + res);

        Scanner in = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int L = in.nextInt();
        int sot = L/100;
        int ost = number % 100;
        int res = ost*10+sotni;
        System.out.println("Результат: " + res);

         */

        //Integer14◦
        //. Дано трехзначное число. В нем зачеркнули первую справа цифру
        //и приписали ее слева. Вывести полученное число.
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int L = in.nextInt();
        int sot = L/100;
        int ed = L%10;
        int des = (L / 10)%10;
        int res = 100*ed+10*sot+des;
        System.out.println("Результат: " + res);



         */

        //Integer15◦
        //. Дано трехзначное число. Вывести число, полученное при перестановке цифр сотен и десятков исходного числа (например, 123 перейдет в
        //213).
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int L = in.nextInt();
        int sot = L/100;
        int ed = L%10;
        int des = (L / 10)%10;
        int res = 100*ed+10*sot+des;
        System.out.println("Результат: " + res);














    }
}
