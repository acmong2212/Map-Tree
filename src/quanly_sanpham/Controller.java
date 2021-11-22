package quanly_sanpham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Controller implements QuanLyProduct{
    static ArrayList<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    static {
        products.add(new Product(1, "Iphone 7", 7000000));
        products.add(new Product(2, "Iphone 8", 5000000));
    }
    @Override
    public void add() {
        System.out.println("Nhap id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten san pham:");
        String name = scanner.nextLine();
        System.out.println("Nhap gia:");
        double cost = Double.parseDouble(scanner.nextLine());

        products.add(new Product(id, name, cost));
    }

    @Override
    public void edit() {
        System.out.println("Nhap id can sua: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).id == id){
                System.out.println("Nhap ten san pham:");
                String name = scanner.nextLine();
                System.out.println("Nhap gia:");
                double cost = Double.parseDouble(scanner.nextLine());
                products.get(i).name = name;
                products.get(i).cost = cost;
                return;
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhap id can xoa: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id){
                products.remove(products.get(i));
                return;
            }
        }
    }

    @Override
    public void display() {
        for (Product p : products) {
            System.out.println(p.toString());
        }
    }

    @Override
    public void search() {
        System.out.println("Nhap ten san pham can tim`: ");
        String name = scanner.nextLine();

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).name.equals(name)) {
                System.out.println(products.get(i));
                return;
            }
        }
    }

    @Override
    public void sort() {
        products.sort(((o1, o2) -> Double.compare(o2.getCost(), o1.getCost())));

//        Collections.sort(products, ((o1, o2) -> Double.compare(o2.getId(), o1.getId())));
    }
}
