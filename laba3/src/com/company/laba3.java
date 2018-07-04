package com.company;

import java.util.Scanner;

/*

 */
public class laba3
{

    private static void printAbonents(House[] mas)
    {

        System.out.print("Введите нижний этаж: ");
        Scanner in = new Scanner(System.in);
        int dw = in.nextInt();

        System.out.print("Введите верхний этаж: ");
        Scanner scan = new Scanner(System.in);
        int up = in.nextInt();

        System.out.print("Введите количетво комнат: ");
        Scanner input = new Scanner(System.in);
        int m = in.nextInt();

        System.out.println("\nСписок квартир, имеющих заданное число комнат и расположенных\n" +
                "на этаже, который находится в заданном промежутке: ");
        for (House ma : mas) {
            if ((ma.getFloor() <= up && ma.getFloor() >= dw) && (ma.getCountofroom() == m)) {
                System.out.println(ma.toString());
            }
        }

    }


    public static void main(String[] args)
    {

        House[] house = new House[2];
        house [0] = new House(1, 36, 70, 6, 3, "Воронянского", "Восьмиэтажка", 100);
        house [1] = new House(2, 54, 43, 5, 2, "Чкалова", "Хрущевка", 150);


        System.out.print("Введите количество комнат: ");
        Scanner in = new Scanner(System.in);
        int room = in.nextInt();
        System.out.println("\nСписок квартир,имеющих заданное число комнат:");
        for (House aHouse : house) {
            aHouse.checkRoom(room);
        }

        System.out.print("Введите площадь: ");
        Scanner scan = new Scanner(System.in);
        int squar_e = in.nextInt();
        System.out.println("\nСписок квартир,имеющих площадь,превосходящую заданную");
        for (House aHouse : house) aHouse.checkSquare(squar_e);


        printAbonents(house);

    }
}
