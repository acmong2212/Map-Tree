package quanly_sanpham;

import java.util.ArrayList;

public class Product extends ArrayList<Product> {
    int id;
    String name;
    double cost;
    static int idNumber = 1;

    public Product(int id, String name, double cost) {
        this.id = idNumber++;
        this.name = name;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public static int getIdNumber() {
        return idNumber;
    }

    public static void setIdNumber(int idNumber) {
        Product.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }
}
