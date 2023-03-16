package ad;

import java.util.Scanner;

public class baitap11 {

    public static void main(String[] args) {
        int arr[], a;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập kích cỡ mảng: ");
        a = sc.nextInt();
        
        arr = new int[a];
        
        System.out.print("Nhập phần tử mảng: ");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }       
            }
        }
        
        System.out.print("Chuỗi sau khi sắp xếp là: ");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
    
}
