public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        int year = 2100;
        checkYear(year);
    }

    private static void checkYear(int year) {
        String leapYear = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                ? year + " год является високосным"
                : year + " год не является високосным";
        System.out.println(leapYear);
    }

    private static void task2() {
        int clientDeviceYear = 2020;
        byte clientOS = 0;
        checkClientDevice(clientOS, clientDeviceYear);
    }

    private static void checkClientDevice(int clientOS, int clientDeviceYear) {

        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    private static void task3() {
        int deliveryDistance = 5;
        int days = getDeliveryDays(deliveryDistance);
        if (days == 0) {
            System.out.println("Доставки не будет");
        } else {
            System.out.println("Потребуется дней: " + days);
        }
    }

    private static int getDeliveryDays(int distance) {
        int days = 0;

        if (distance > 0 && distance < 20) {
            days = days + 1;
        } else if (distance >= 20 && distance < 60) {
            days = days + 2;
        } else if (distance >= 60 && distance < 100) {
            days = days + 3;
        }
        return days;
    }
}
