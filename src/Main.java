import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        printLeapYearOrNotYear(2021);
        System.out.println("Task2");
        printInfoAboutVersion (1, 2023);
        System.out.println("Task3");
        int deliverydays = calculateDeliveryDays(101);
        if (deliverydays > 0) {
            System.out.println("Потребуется дней " + deliverydays);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void printLeapYearOrNotYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("год " + year + " - високосный год");
        } else {
            System.out.println("год " + year + " - невисокосный");
        }
    }

    public static void printInfoAboutVersion(int os, int clientDeviceYear) {
        if (os != 0 && os != 1) {
            System.out.println("Некорректная ОС");
            return;
        }
        int curentYear = LocalDate.now().getYear();
        if (os == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для Android");
        } else if (os == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS");
        } else if (os == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS");
        } else if (os == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android");
        }
    }
    public static int calculateDeliveryDays (int distance) {
        if (distance < 0 || distance > 100) {
            return 0;
        }
        int days = 1;
        if (distance >= 20) {
            days++;
        }
        if (distance >= 60) {
            days++;
        }
        return days;
    }
}