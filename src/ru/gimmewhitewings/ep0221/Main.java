package ru.gimmewhitewings.ep0221;

public class Main {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1 == b2); // Предупреждение потому что выражение всегда будет false
        System.out.println("Hello, World!");

        float f1 = 0.1f; //У флоата лучше писать f на конце, чтобы норм инициализировалось. Иначе будет 0.000000001
        float f2 = 0.2f;

        System.out.println(f1 + f2 == 0.3); //Динамическое преобразование типа данных
        System.out.println(f1 + f2 == 0.3f); //Так делать будет лучше

        double f11 = 1.0 / 3.0;
        double f12 = 2.0 / 3.0;
        System.out.println(f11 + f12);
        String str = "WOW";
        // Для сравнения строк лучше использовать .equals(), не ==
        str += "add";
        System.out.println(str);

        doSmth(str);
    }

    static void doSmth(String row) {
        System.out.println(row.length());
    }
}
