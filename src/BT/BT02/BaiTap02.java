package BT.BT02;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};

        System.out.println("Nhập số muốn chèn vào:");
        int number = sc.nextInt();

        System.out.println("Nhập vị trí muốn chèn:");
        int index = sc.nextInt();

        if(index < 0 || index > arr.length - 1) {
            System.out.println("Vị trí " + index + " không tồn tại!");
            return;
        }

        for (int i = arr.length - 1; i >= index; i--) {
            if(i == index) {
                arr[i] = number;
                break;
            }
            arr[i] = arr[i - 1];
        }

        System.out.println(Arrays.toString(arr));
    }
}
