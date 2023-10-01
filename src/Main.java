import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = 3;
        double average = 2;
        double smallest = 1;
        //todo дописать логику программы ниже.


        //todo
        {
        if (first>second)
            if (first>third)
                if (second>third) greatest = first; average = second; smallest = third;
        }
        { if (first>second)
            if (first<third)
                if (third>second)
                    greatest = third; average = first; smallest = second;
        }
        {
            if (first<second)
                if (first<third)
                    if (third<second)
                        greatest = second; average = third; smallest = first;
        }

        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }

    }
