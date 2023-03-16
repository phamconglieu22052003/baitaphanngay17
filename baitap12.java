package ad;

import java.util.Scanner;

public class baitap12 {

    public static void main(String[] args) {
        int arr[][], hang, cot, max = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số hàng: ");
        hang = sc.nextInt();
        System.out.print("Nhập số cột: ");
        cot = sc.nextInt();
        
        arr = new int[hang][cot];
        
        System.out.print("Nhập phần tử của ma trận: ");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Ma trận: ");
        for ( int i = 0; i < hang; i++) {
            for ( int j = 0; j < cot; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
        
        System.out.print("Phần tử lớn nhất trong ma trận là: ");
        for ( int i = 0; i < hang; i++) {
            for ( int j = 0; j < cot; j++) {
                if (max < arr[i][j]) 
                    max = arr[i][j];               
            }
        }
        System.out.println(max);
    }
    
}