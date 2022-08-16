import java.time.LocalDate;

public class Main {
    // Задание 1
    public static void main(String[] args) {
        printIsEvenNumberResult(2012);
        String osName = "iOS";
        int currentYear = LocalDate.now().getYear();
        System.out.println(getMessage(1, 2011));
        int days = deliveryDays(60);
        if(days > 0) {
            System.out.println("Потребуется " + days + " дней на доставку");
        } else {
            System.out.println("Доставака невозможна");
        }
    }

    private static boolean isEvenNumber(int number) {
        return (number % 4 == 0) && (number % 100 != 0) || (number % 400 == 0);
    }

    private static void printIsEvenNumberResult(int number) {
        if (isEvenNumber(number)) {
            System.out.println(number + " - високосный год");
        } else {
            System.out.println(number + " - невисокосный год");
        }
    }

    // Задание 2
    String osName = "iOS";
    String s = getMessage(1, 2014);
    int currentYear = LocalDate.now().getYear();

    public static String getMessage(int clientOS, int currentYear) {
        int clientOSIOS = 0;
        int clientOSAndroid = 1;
        if (currentYear < 2015 && clientOS == clientOSIOS) {
            return "Установите облегченную версию приложения для iOS по ссылке";
        } else if (currentYear < 2015 && clientOS == clientOSAndroid) {
            return "Установите облегченную версию приложения для Android по ссылке";
        } else {
            return "Установить приложение";
        }
    }

    // Задание 3
    public static int deliveryDays(int distance) {
        if (distance >= 0 && distance <= 20) {
            return 1;
        } else if (distance > 20 && distance <= 60) {
            return 2;
        } else if (distance > 60 && distance <= 100) {
            return 3;
        } else
            return -1;
    }
}







