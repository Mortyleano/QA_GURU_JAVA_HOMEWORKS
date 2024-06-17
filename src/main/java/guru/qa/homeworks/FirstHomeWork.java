package guru.qa.homeworks;

public class FirstHomeWork {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int maxIntValue = Integer.MAX_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        double c = 1.0;
        double d = 2.0;
        boolean t = true;
        boolean f = false;

        // Выполняем математические операции с типом int
        System.out.println("Выражение 'a + b' будет равным " + (a + b));
        System.out.println("Выражение 'a - b' будет равным " + (a - b));
        System.out.println("Выражение 'a / b' будет равным " + (a / b));
        System.out.println("Выражение 'a * b' будет равным " + (a * b));
        System.out.println("Выражение 'a % b' будет равным " + (a % b));
        System.out.println("-------------------------------------------");

        // Выполняем математические операции с типом double
        System.out.println("Выражение 'c + d' будет равным " + (c + d));
        System.out.println("Выражение 'c - d' будет равным " + (c - d));
        System.out.println("Выражение 'c / d' будет равным " + (c / d));
        System.out.println("Выражение 'c * d' будет равным " + (c * d));
        System.out.println("Выражение 'c % d' будет равным " + (c % d));
        System.out.println("-------------------------------------------");

        // Выполняем логические операции
        System.out.println("Выражение 't != f' будет равным " + (t != f));
        System.out.println("Выражение 't == f' будет равным " + (t == f));
        System.out.println("Выражение 't || f' будет равным " + (t || f));
        System.out.println("Выражение 't && f' будет равным " + (t && f));
        System.out.println("-------------------------------------------");

        // Выполняем переполнение для максимального значения типа int
        System.out.println("Максимальным значением для типа 'int' будет равным " + maxIntValue);
        System.out.println("Если переполнить максимальное значение типа 'int' на 1, оно будет равным " + (maxIntValue + 1));
        System.out.println("-------------------------------------------");

        // Выполняем переполнение для максимального значения типа double
        System.out.println("Максимальным значением для типа 'double' будет равным " + maxDoubleValue);
        System.out.println("Если переполнить максимальное значение типа 'double' на 1, оно будет равным " + (maxDoubleValue + 1));
        System.out.println("-------------------------------------------");

        // Выполняем вычисления с комбинацией разных типов данных: int и double
        System.out.println("Выражение 'a + c' будет равным " + (a + c));
        System.out.println("Выражение 'b - d' будет равным " + (b - d));
        System.out.println("Выражение 'a * c' будет равным " + (a * c));
        System.out.println("Выражение 'b / d' будет равным " + (b / d));
        System.out.println("Выражение 'a % c' будет равным " + (a % c));
        System.out.println("-------------------------------------------");
    }
}