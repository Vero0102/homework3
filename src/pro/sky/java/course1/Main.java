package pro.sky.java.course1;

public class Main {

    //Задание № 1
    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задание № 2
        int clientDeviceYear = 2013;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
    }
        //Задание № 3
        int year = 2021;
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeapYear)    {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        //Задание № 4
        int deliveryDistance = 25;
        if (deliveryDistance <= 20) {
            System.out.println("Для доставки потребуется 1 день");
        } else if ((deliveryDistance > 20) && (deliveryDistance <= 60)) {
            System.out.println("Для доставки потребуется 2 дня");
        } else if ((deliveryDistance > 60) && (deliveryDistance <= 100)) {
            System.out.println("Для доставки потребуется 3 дня");
        } else {
            System.out.println("К сожалению, в Ваш регион доставка не осуществляется.");

        }

        int monthNumber = 7;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц принадлежит к сезону зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит к сезону весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит к сезону лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит к сезону осень.");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

        }

    }

