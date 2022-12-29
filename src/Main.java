import java.time.LocalDate;

public class Main {

    public static void calculationLeapYear(int year) {
        if (year%4==0 && year%100 !=0 || year%400==0) {//
            System.out.println(year+" является високосным.");
        }
        else {
            System.out.println(year+" не является високосным.");
        }
    }
    public static void giveIndicationClient (int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
        } else if (clientDeviceYear>2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else{
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
    }

    public static int calculationDeliveryDays (int distance){
        int day = 1;
        if (distance > 20) {
            day++;
        }
        if (distance > 60) {
            day++;
        }
        System.out.println("Потребуется дней: " + day);
        if (distance > 100) {
            System.out.println("Доставка не осуществляется");
        }
        return day;
    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year=2020;
        calculationLeapYear(year);

        System.out.println("Задача 2");
        int clientOS=0;
        int currentYear = LocalDate.now().getYear();
        giveIndicationClient(clientOS, currentYear);

        System.out.println("Задача 3");
        int deliveryDistance = 120;
        calculationDeliveryDays (deliveryDistance);
    }
}



