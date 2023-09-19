package BT.BT06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BaiTap06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số hàng của mảng: ");
        int row = sc.nextInt();

        System.out.println("Nhập số cột của mảng: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Nhập giá trị của các phần tử trong mảng:");
        for (int[] array : arr) {
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }
        }

        System.out.println("Mảng của bạn là: " + Arrays.deepToString(arr));
        System.out.println("Nhập cột mà bạn muốn tính tổng: ");
        int inputCol = sc.nextInt();
        int sum = 0;

        for (int[] array: arr){
            for(int i = 0; i < array.length; i++) {
                if(i == inputCol) {
                    sum += array[i];
                }
            }
        }

        System.out.println("Tổng các phần tử cột thứ " + inputCol + " là: " + sum);
    }
}
