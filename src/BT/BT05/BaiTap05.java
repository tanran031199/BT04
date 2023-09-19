package BT.BT05;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;

        System.out.println("Nhập số lượng phần tử trong mảng");
        size = sc.nextInt();
        arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Mảng của bạn là: " + Arrays.toString(arr));
        System.out.println("Giá trị nhỏ nhất của mảng là: " + new FindMin(arr).getMin());
    }
}
