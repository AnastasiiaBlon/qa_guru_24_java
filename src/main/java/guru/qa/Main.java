package guru.qa;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // целочисленные
        byte aByte = 0; // -128 +127; 8bit
        short aShort = 0; // -32768 +32767; 16bit
        int aInt = 0; // 32bit (-2^32) .. (+2^32 -1)
        Integer intWrapper = 0;
        long aLong = 0L; // 64bit

        // floating point
        float aFloat = 0.0F; // 32bit
        double aDouble = 0.0; // 64bit
        Double doubleWrapper = 1.0;

        // Символьный
        char aChar = 'a';
        Character charWrapper = 's';

        // Логический
        boolean aBoolean = true;

        // String (и бесконечное множество объектных/ссылочных типов данных)
        String toBePrinted = "Hello world!";
        // System.out.println("toBePrinted");
        List<String> teachers = List.of("Stanislav", "Dmitrii");

        // Операторы
        // Оператор присвоения =
        String todayDecember = "December 6th, 2024";
        List<String> days = List.of("December 7th, 2024", "December 8th, 2024", "December 9th, 2024");

        //Арифметические операторы + - / * % ++ --
        Integer a = 5;
        Integer b = 9;
        int result = ++aInt;
        // System.out.println(a + b);
        // System.out.println(b - a);
        // System.out.println(b / a);
        // System.out.println(a * b);
        // System.out.println(a % b);
        // System.out.println(b % a);
        // System.out.println(++b);
        // System.out.println(--a);
        // System.out.println(3.0 + 4);
        // System.out.println(result)

        // Операторы сравнения <, >, >=, <=, !=, ==
        // System.out.println(a > b); false
        // System.out.println(a < b); true
        // System.out.println(a >= b); false
        // System.out.println(a <= b); true
        // System.out.println(a != b); true
        // System.out.println(a == b); false
        // System.out.println(3 >= 3); // true

        // Логические операторы & (и), | (или), &&, ||, ^, !

        String nameFirst = "Anastasiia";
        int age = 31;
        // System.out.println(nameFirst.equalsIgnoreCase("Anastasiia") && age == 31);
        // System.out.println(nameFirst.equalsIgnoreCase("Anastasiia") || age == 39);
        // System.out.println(!(nameFirst.equalsIgnoreCase("Anastasiia"))); // false

        // Оператор instanceof
        // System.out.println(nameFirst instanceof String);

        // Тернарный операторв
        char sex = 'm';
        String childName = sex == 'm'
                ? "Valentin"
                : "Valentina";

        // Управляющая конструкция if
        if (sex == 'm') {
            childName = "Valentin";
        } else {
            childName = "Valentina";
        }

        String today = "snow";
        String planNumberOne = "stayHome";
        String planNumberTwo = "goShopping";
        if (today == "snow") {
            planNumberOne = "stayHome";
        } else {
            planNumberTwo = "goShopping";
        }

        // key word: new
        //Переполнение
            int x = Integer.MAX_VALUE;
            int y = Integer.MAX_VALUE;
            int z = x * y;
            System.out.println(z); // 1

            double maxDouble = Double.MAX_VALUE;
            double randomDouble = 4.5;
            double resultDouble = maxDouble * randomDouble;
            System.out.println(resultDouble); // Infinity
        }
}