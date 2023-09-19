package BT.BT01;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println("Mảng ban đầu là: " + Arrays.toString(arr));

        System.out.println("Nhập phần tử cần xóa khỏi mảng: ");
        int number = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                found = true;

                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
            arr[arr.length - 1] = 0;
        }

        if (found) {
            System.out.println("Mảng đã được cập nhật là: " + Arrays.toString(arr));
        } else {
            System.out.println(number + " không nằm trong mảng!");
        }
    }
}
