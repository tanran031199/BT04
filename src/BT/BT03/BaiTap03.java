package BT.BT03;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1;
        System.out.println("Nhập số lượng phần tử của mảng 1:");
        int arr1Size = sc.nextInt();
        arr1 = new int[arr1Size];
        System.out.println("Nhập các phần tử của mảng 1:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2;
        System.out.println("Nhập số lượng phần tử của mảng 2:");
        int arr2Size = sc.nextInt();
        arr2 = new int[arr2Size];
        System.out.println("Nhập các phần tử của mảng 2:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new Concat(arr1, arr2).getArr();

        System.out.println("Mảng mới là: " + Arrays.toString(arr3));
    }
}
