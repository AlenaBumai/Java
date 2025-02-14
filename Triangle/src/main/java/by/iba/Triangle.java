package by.iba;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    int a;
    int b;
    int c;

    public static String defineTriangle() {
        int[] num = getNum();

        int a = num[0];
        int b = num[1];
        int c = num[2];

        if (a <= 0 | b <= 0 | c <= 0) {
            System.out.println("треугольник  с такими сторонами не существует");
            return "wrong";
        } else if (a + b < c | a + c < b | b + c < a) {
            System.out.println("треугольник  с такими сторонами не существует");
            return "wrong";
        } else {
            if (a == b & b == c) {
                System.out.println("треугольник  с такими сторонами - равносторонний");
                return "allequal";
            } else if (a == b & a != c | a == c & a != b | b == c & a != b) {
                System.out.println("треугольник  с такими сторонами - равнобедренный");
                return "twoequal";
            } else {
                System.out.println("треугольник  с такими сторонами - с разными сторонами");
                return "different";

            }
        }

    }

    public static int[] getNum() {

        int[] numbers = new int[3];

            try {
                Scanner in = new Scanner(System.in);

                System.out.println("Введите сторону треугольника a (целое число)");
                numbers[0] = in.nextInt();

                System.out.println("Введите сторону треугольника b (целое число)");
                numbers[1] = in.nextInt();

                System.out.println("Введите сторону треугольника c (целое число)");
                numbers[2] = in.nextInt();
                return numbers;

            } catch (InputMismatchException e)
            {System.out.println("Ошибка: введено не целое число.");

            }


        return numbers;
    }


    }
