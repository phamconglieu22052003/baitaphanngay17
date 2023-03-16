package ad;

import java.util.Scanner;

public class baitap10 {

    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        int dem = 0;
        
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Nhập chuỗi không dấu không quá 80 ký tự: ");
            chuoi = sc.nextLine();
        }while(chuoi.length() < 1 || chuoi.length() > 80);
        
        System.out.println("Số ký tự của chuỗi: " + chuoi.length());
        
        System.out.print("Nhập 1 ký tự bất kỳ muốn đếm: ");
        kyTu = sc.next().charAt(0);
        
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                dem++;
            }
        }
        
        System.out.println("Ký tự " + kyTu + " xuất hiện " + dem + " lần");
    }
    
}
