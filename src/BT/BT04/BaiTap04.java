package BT.BT04;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr;

        System.out.println("Nhập số hàng: ");
        int m = sc.nextInt();

        System.out.println("Nhập số cột: ");
        int n = sc.nextInt();

        arr = new int[m][n];
        int max = arr[0][0];
        String position = "";

        System.out.println("Nhập các phần tử của mảng");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    position = i + ", " + j;
                }
            }
        }

        System.out.println("Giá trị lớn nhất là: " + max);
        System.out.printf("Vị trí của phần tử đó là: " + position);
    }
}
