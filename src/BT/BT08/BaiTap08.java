package BT.BT08;

import java.util.Scanner;

public class BaiTap08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "Hello Java!!!";

        System.out.println("Nhập ký tự mà bạn muốn tìm!");
        char input = sc.next().charAt(0);

        int count = 0;
        for (char i : str.toCharArray()) {
            if(i == input) count++;
        }

        System.out.println("Số lần xuất hiện của ký tự là: " + count);
    }
}
