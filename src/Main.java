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

    public static boolean isDeviceOld (int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear<currentYear;
    }
    public static void giveIndicationClient (int clientOS, int clienDeviceYear) {
        boolean deviceOld = isDeviceOld(clienDeviceYear);
        System.out.print("Установите ");
        if (deviceOld) {
            System.out.print("облегченную ");
        } else {
            System.out.print("обычную ");
        }
        System.out.print("версию приложения ");
        if (clientOS == 0) {
            System.out.println("для iOS по ссылке.");
        } else {
            System.out.println("для Android по ссылке.");
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
        giveIndicationClient(1, 2023);

        System.out.println("Задача 3");
        int deliveryDistance = 120;
        calculationDeliveryDays (deliveryDistance);
    }
}



