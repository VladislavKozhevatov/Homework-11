import java.time.LocalDate;

public class Main {

    private static boolean checkIsYearLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static  String reccomendAplicationVersion (int clientDeviceYear, int clientOs) {
        String resultmessage = "Установите";
        if (isOldDevice(clientDeviceYear))
            resultmessage += " облегчённую";
        resultmessage += " версию для";
        if(clientOs==1){
            resultmessage += " Android";
        } else {
            resultmessage += " ios";
        }
        return resultmessage;
    }
    private static boolean isOldDevice (int clientDeviceYear){
        int currentYear = 2015;
        return clientDeviceYear < currentYear;
    }

    private static int deliveryDistanceDays(int deliveryDistance){
        int result = 0;
        if (deliveryDistance <=20){
            result = 1;
        } else if (deliveryDistance>20 && deliveryDistance<=60) {
            result =  2;
        } else if(deliveryDistance>60 && deliveryDistance<=100){
            result= 3;
        } else  {
            System.out.println("Не доставляем");
        }
        return result;
    }

    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int year = 2400;
        checkIsYearLeap(year);
        if (checkIsYearLeap(year)) {
            System.out.println(year + "-год является високосным");
        } else {
            System.out.println(year + "-год не является високосным");
        }
        //Задача 2
        System.out.println("Задача 2");
        int clientDeviceYear = 2018;
        int clientDeviceOS = 0;//0-iOS;1-Android;
        System.out.println(reccomendAplicationVersion(clientDeviceYear,clientDeviceOS));
        //Задача 3
        System.out.println("Задача 3");
        int deliveryDistance = 40;
        deliveryDistanceDays(deliveryDistance);
        System.out.println("Доставка " +deliveryDistanceDays(deliveryDistance)+" дня");

    }
}