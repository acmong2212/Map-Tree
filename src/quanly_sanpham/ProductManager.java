package quanly_sanpham;

import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Quan ly san pham");
            System.out.println("1. Them san pham");
            System.out.println("2. Sua thong tin san pham theo id");
            System.out.println("3. Xoa san pham theo id");
            System.out.println("4. Hien thi danh sach san pham");
            System.out.println("5. Tim kiem san pham theo ten");
            System.out.println("6. Sap xep san pham tang dan, giam dan theo gia");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    controller.add();
                    break;
                case 2:
                    controller.edit();
                    break;
                case 3:
                    controller.delete();
                    break;
                case 4:
                    controller.display();
                    break;
                case 5:
                    controller.search();
                    break;
                case 6:
                    controller.sort();
                    break;
            }
        }
    }
}