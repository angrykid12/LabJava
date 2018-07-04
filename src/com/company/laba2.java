package com.company;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class laba2 {
    public static void main(String args[]) {
        final Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность матрицы NxN: ");
        int n = in.nextInt();

        if (n == Integer.MAX_VALUE) {
            System.out.println("Некорректное значение размера!");
            return;
        }
        int[][] matrix = new int[n][n];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(2 * 5) - 3;
                System.out.printf("%3s", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        //
        //Необходимо завести пустой временный массив. В цикле идти по элементам матрицы.
        // Если очередной элемент больше, чем самый маленький из временного массива,
        // то добавляем его во временный массив.
        // Если во временном массиве стало n+1 элементов, то самый маленький удаляется, чтобы снова стало n элементов.
        // В конце вывести этот массив.
        int[][] result = new int[n + 2][n + 2];
        for (int i = 0; i < n + 2; i++) {
            for (int j = 0; j < n + 2; j++) {
                if (i == 0 || i == n + 1 || j == 0 || j == n + 1)
                    result[i][j] = Integer.MAX_VALUE;
                else
                    result[i][j] = matrix[i - 1][j - 1];
            }
        }
        int count = 0; //
        ArrayList<Integer> list = new ArrayList<>();
        //и пробегам про всей матрице:нижние углы,верхние столбцы и строки(кроме углоых)
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (result[i][j] > result[i - 1][j - 1] &&
                        result[i][j] > result[i][j - 1] &&
                        result[i][j] > result[i - 1][j] &&
                        result[i][j] > result[i + 1][j] &&
                        result[i][j] > result[i][j + 1] &&
                        result[i][j] > result[i + 1][j + 1] &&
                        result[i][j] > result[i + 1][j - 1] &&
                        result[i][j] > result[i - 1][j + 1]) {
                    count++;
                    list.add(result[i][j]);
                    System.out.printf("Найден локальный максимум в координатах "
                            + "[%s][%s]=%s", i, j, result[i][j] + "\n");
                }
            }
        }
        int localMax = Integer.MIN_VALUE;
        for (Integer aList : list) {
            if (aList > localMax)
                localMax = aList;
        }
        System.out.println("Число локальных максимумов: " + count);
        if (list.size() != 0)
            System.out.println("Наибольший из них: " + localMax);

    }
}
