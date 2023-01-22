package com.example;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        String a = "I like Java!!!";
        printText(a);
        //2. Распечатать последний символ строки. Используем метод String.charAt().
        System.out.println(a.length());
        System.out.println(a.charAt(a.length() - 1));

        //3. Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
        System.out.println(a.endsWith("!!!"));

        //4. Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
        System.out.println(a.startsWith("I like"));

        //5. Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println(a.contains("C++"));

        //6. Найти позицию подстроки “Java” в строке “I like Java!!!”.
        System.out.println(a.indexOf("Java"));

        //7. Заменить все символы “а” на “о”.
        System.out.println(a.replace("a", "o"));

        //8. Преобразуйте строку к верхнему регистру.
        System.out.println(a.toUpperCase());

        //9. Преобразуйте строку к нижнему регистру.
        System.out.println(a.toLowerCase());

        //10. Вырезать строку Java c помощью метода String.substring().
        System.out.println(a.substring(7, 11));

    }

    //1. Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
    public static void printText(String text) {
        System.out.println(text);
    }
}
